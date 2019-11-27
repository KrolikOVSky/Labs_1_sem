package Lab6;

import java.util.Scanner;
public class Lab6_1{

    private static void calculating(double x){
        double g, z, y;
        g = x <= 0 ? (3 + Math.sin(x))/(1 + Math.pow(x, 2)) : 2 * Math.pow(x, 2) * Math.pow(Math.cos(x), 2);
        if(x < 0) z = Math.pow(Math.abs(x), 1/3);
        else if((x >= 0) && (x <= 1)) z =  (-2) * x + x / (1 + x);
        else z = (Math.abs(3 - x)) / (1 + x);
        y = g + z;
        System.out.printf("g = %8.10f\tz = %8.10f\ty = %8.10f\n",g, z, y);
    }

    public static void main( ){
        double g, z, y, x;
        Scanner read = new Scanner (System.in);
        System.out.print("Please enter x = ");
        x = read.nextDouble();
        read.close();
        calculating(x);
    }
}