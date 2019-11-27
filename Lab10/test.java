package Lab10;

import java.util.*;
public class test{
    public static void teswt(){
        Scanner in = new Scanner(System.in);
        int length = 0;
        System.out.print("Length = ");
        boolean bool = false;
        //in.close();
        A: if(in.hasNextInt())length = in.nextInt();
        else break A;
        //length = in.nextInt();
        //break A
        System.out.println("Length solve = "+length+"");
    }
    
}