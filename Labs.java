import java.util.Scanner;
public class Labs{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        byte num = (byte)0;
        System.out.print("Please enter number of lab: ");
        if(scanner.hasNextByte()){
            num = (byte)scanner.nextByte();
            scanner.close();
        }
        else{
            System.out.println("Wrong symbol");
            scanner.close();
            return;
        }
        Lab1.Lab1 lab1 = new Lab1.Lab1();
        Lab2.Lab2 lab2 = new Lab2.Lab2();
        Lab3.Lab3 lab3 = new Lab3.Lab3();
        Lab4.Lab4 lab4 = new Lab4.Lab4();
        Lab5.Lab5 lab5 = new Lab5.Lab5();
        Lab6.Lab6_1 lab6 = new Lab6.Lab6_1();
        Lab7.Lab7 lab7 = new Lab7.Lab7();
        Lab8.Lab8 lab8 = new Lab8.Lab8();
        Lab9.Lab9_1 lab9 = new Lab9.Lab9_1();
        Lab10.Lab10 lab10 = new Lab10.Lab10();
        Lab11.Lab11 lab11 = new Lab11.Lab11();
        Lab12.Lab12 lab12 = new Lab12.Lab12();
        switch(num){
            case 1: lab1.main(args); break;
            case 2: lab2.main(args); break;
            case 3: lab3.main(args); break;
            case 4: lab4.main(args); break;
            case 5: lab5.main(args); break;
            case 6: lab6.main(args); break;
            case 7: lab7.main(args); break;
            case 8: lab8.main(args); break;
            case 9: lab9.main(args); break;
            case 10: lab10.main(args); break;
            case 11: lab11.main(args); break;
            default: System.out.println("Wrong number of lab");
        }
    }
}