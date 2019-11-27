package Lab7;

import java.util.*;
public class test2{
    
    private static int random(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        //double x = scanner.nextDouble();
        
        for (int i = 0; i <= 10; i++){
            System.out.print(random(1, 5));
        }
        
    }
}