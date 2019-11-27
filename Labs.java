import java.util.Scanner;
public class Labs{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Lab1.Lab1 lab1 = new Lab1.Lab1();
        Lab2.Lab2 lab2 = new Lab2.Lab2();
        Lab3.Lab3 lab3 = new Lab3.Lab3();
        Lab4.Lab4 lab4 = new Lab4.Lab4();
        Lab5.Lab5 lab5 = new Lab5.Lab5();
        Lab6.Lab6_1 lab6 = new Lab6.Lab6_1();
        Lab7.Lab7 lab7 = new Lab7.Lab7();
        Lab8.Lab8 lab8 = new Lab8.Lab8();
        Lab9.Lab9 lab9 = new Lab9.Lab9();
        Lab10.Lab10 lab10 = new Lab10.Lab10();
        Lab11.Lab11 lab11 = new Lab11.Lab11();
        switch(num){
            case 1: lab1.main(); break;
            case 2: lab2.main(); break;
            case 3: lab3.main(); break;
            case 4: lab4.main(); break;
            case 5: lab5.main(); break;
            case 6: lab6.main(); break;
            case 7: lab7.main(); break;
            case 8: lab8.main(); break;
            case 9: lab9.main(); break;
            case 10: lab10.main(); break;
            case 11: lab11.main(); break;
        }
    }
}