package Lab9;

import java.util.*;
public class min{

    private static int[] sortBubble(int[] array){
        
        boolean flag;
        for(int i = array.length - 1; i > 0; i--){
            flag = true;
            for(int j = 0; j < i; j++)
                if (array[j] > array[j + 1]) {
                    int b = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = b;
                    flag = false;

                }
        }
        return array;
    }
    

    private static int min(int [] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];

        }
        return min;
    }

    private static void arrayList(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%-1d ", array[i]);
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] array = new int [6];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(255);            
        }
        arrayList(array);
        System.out.printf("min = %d\n", min(array));
        arrayList(sortBubble(array));
    }
}