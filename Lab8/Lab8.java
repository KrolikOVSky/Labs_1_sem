public class Lab8{

    private static void arrayList(short[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);            
        }
        System.out.println();
    }

    private static void directChooseSorting(short[] a){
        short min;
        int n_min;
        int i, j;
        for(i = 0; i < a.length - 1; i++){
            min = a[i];
            n_min = i;
            for(j = i + 1; j < a.length; j++)
                if (a[j] > min) {
                    min = a[j];
                    n_min = j;
                }
            a[n_min] = a[i];
            a[i] = min;
        }
    }

    private static short summAbsArray(short[] array){
        short sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += Math.abs(array[i]);
        }
        return sum;
    }

    private static void change(short[] array, int a, int b){
        for (int i = 0; i < array.length; i++){
            if(array[i] < 0 && Math.abs(array[i]) > b)array[i] /= a;            
        }
    }

    public static void main(String [] args){
        short[] array = {-5, 0, -15, -10, 10, 5, 15};
        System.out.println("Main array:");
        arrayList(array);
        System.out.println("\nSorting array:");
        directChooseSorting(array);
        arrayList(array);
        System.out.printf("\nAbs summ of elements: %d\n\n", summAbsArray(array));
        System.out.println("Changing array:");
        change(array, 5, 2);
        arrayList(array);
    }
}