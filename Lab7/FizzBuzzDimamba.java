package Lab7;

import java.util.Scanner;
public class FizzBuzzDimamba{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number %= 3;
        for (; number == 0;){
            System.out.println("Fizz");
            break;
        }

        for (; number == 1;){
            System.out.println("Buzz");
            break;
        }

        for (; number == 2;){
            System.out.println("Dimamba");
            break;
        }
    }
}
