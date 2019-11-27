package Lab10;

import java.util.Scanner;
public class Lab10{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre size of array:\nLength = ");
        int length = 1;
        if(scanner.hasNextInt()) {
            length = scanner.nextInt();
            scanner.close();
        }
        else {
            System.out.println("Wrong symbol!!!");
            scanner.close();
            return;
        }
        int[] array = new int[length];
        libruary.filling(array, -50, 50);
        libruary.printArray(array);
        int min = Math.abs(array[0]);
        min = libruary.recursing(array, -1, min);
        System.out.printf("Minimum by Abs = %d\n", min);
        System.out.printf("Numbers in interval = %d",libruary.quantityOfNumbers(array, -10, 10));

    }
}