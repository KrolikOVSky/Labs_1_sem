package Lab9;

import java.util.*;
public class Lab9{

    private static int[] vector(int[][] array){
        int[] vector = new int [array[0].length];
        int count;
        for(int i = 0; i < array[0].length; i++){
            count = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j][i] < 0)count++;
            }
            vector[i] = count;
        }
        return vector;
    }

    private static int random(int min, int max){
        Random random = new Random();
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    private static void fillingOfArray(int[][] array){
        int start = 1;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = random(-999, 999);//start; //
                start += 1;
            }
        }
    }

    private static void arrayList(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.printf("% 2d\t", array[i][j]);          
            }
            System.out.println();
        }
    }

    private static void arrayList2(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%-1d ", array[i]);
        }
        System.out.println();
    }

    private static void maxElemOfMainDiag(int [][] array){
        int max = 0;
        int length = array.length;
        if(array[0].length < array.length)length = array[0].length;
        for(int i = 0; i < length; i++){
            if (array[i][i] > 0 && array[i][i] > max) max = array[i][i];
        }
        System.out.printf("\nMax Element of main line: %d\n",max);
    }

    private static int[][] transponation(int[][] array){
        int col = array[0].length;
        int line = array.length;
        int[][] solve = new int[col][line];
        for(int i = 0; i < line; i++){
            for(int j = 0; j < col; j++){
                solve[j][i] = array[i][j];
            }
        }
        return solve;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of matrix");
        System.out.print("Line = ");
        int line = scanner.nextInt();
        System.out.print("Column = ");
        int col = scanner.nextInt();
        int[][] matrix = new int[line][col];
        fillingOfArray(matrix);
        arrayList(matrix);
        maxElemOfMainDiag(matrix);
        System.out.println("\nVector of number of negtive digits in each column:"); 
        arrayList2(vector(matrix));
        System.out.println("\nTransponation of martix: ");
        arrayList(transponation(matrix));
    }
}