package Lab5;

import java.util.Scanner;
public class Lab5{

    public static char expression(char c, char d){
        char a = Character.isDigit(c) && c == '&' || Character.isLetter(d) ? Character.toLowerCase(d) : c;
        System.out.println("a = " + a);
        return a;
    }

    public static void design(){
        for (int j = 0; j <= 26; j++){
            System.out.print("----");                                
        }
        System.out.println();
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        char c, d;
        System.out.println("Please enter some characters");
        design();
        for (int i = 0; i < 4; i++){
            System.out.print("c = ");
            c = in.next().charAt(0);           
            System.out.print("d = ");
            d = in.next().charAt(0);
            expression(c, d);
            design();
        }
    }
}