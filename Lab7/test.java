package Lab7;

import java.util.*;
public class test{

    private static void arrayList2(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            System.out.print(a[i]);
        }
    }

    private static int random(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            int r = random(1, length);
            int k = 0;
            while (k < i){
                if (array[i] == 0){
                    if (array[k] != r){
                        k++;
                        continue;                    
                    }
                    r = random(1, length);
                    k = 0;
                }
            }
            array[i] = r;
        }
        arrayList2(array);
    }
}