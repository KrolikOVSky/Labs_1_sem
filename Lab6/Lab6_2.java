import java.util.Scanner;
public class Lab6_2{
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        String num = read.nextLine();
        String value = "";
        switch(num){
            case "1": value = "A"; break;
            case "2": value = "B"; break;
            case "3": value = "C"; break;
            case "4": value = "D"; break;
            case "5": value = "E"; break;
            case "6": value = "F"; break;
            case "7": value = "G"; break;
            case "8": value = "H"; break;
            case "9": value = "I"; break;
            case "0": value = "Z"; break;
            //default: value = "Wrong symbol";
        }
        System.out.printf("%s - %s\n",num,value);
        read.close();
    }
}
