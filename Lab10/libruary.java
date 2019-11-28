package Lab10;

import java.util.Random;
public class libruary{

    public static int quantityOfNumbers(int[] array, int a, int b){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            int x = array[i];
            if(x > a && x < b);
            else count++;            
        }
        return count;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int recursing2(int [] array, int start, int end){

        int i = start;
        int min = array[i];
        if (min <= end){
            if(array[i] < min){
                min = array[i];
                i++;
                start++;
                min = recursing(array, start, end);
            }
            
            
        }
        return min;

    }

    public static int recursing(int[] array, int i, int min){
        i++;
        if(i < array.length) {
            if(Math.abs(array[i]) < min){
                min = Math.abs(array[i]);
                min = recursing(array, i, min);
                return min;
            }
            else{
                min = recursing(array, i, min);
            }
        }
        return min;
    }

    private static int random(int min, int max){
        Random random = new Random();
        int diff = (max - min) + 1;
        int i = random.nextInt(diff);
        i += min;
        return i;
    }

    public static void filling(int[] array, int min, int max){
        for(int i = 0; i < array.length; i++){
            array[i] = random(min, max);
        }
    }
}