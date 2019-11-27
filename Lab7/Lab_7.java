package Lab7;

public class Lab_7{

    public static double function(double x){
        double y = 1.0 / Math.pow(x, 1 / 3.0);                
        return y;
    }

    public static double recurentFunction(double x, int n){
        double y = x;
        double z = 0;
        for (int i = 1; i <= n; i++, y--){
            z = y + (1.0 / 3.0) * (y + (x * Math.pow(y, 4)));
            //System.out.printf ("x=%-10.6f, y=%-10.6f, i=%-4d\n",x,z,i);
        }
        return z;
    }

    public static void tabulation(double startX, double endX, double deltaX){
        double x = startX, yt, yn ,e;
        int n = 10;
        while (x <= endX){
            yt = function(x);
            yn = recurentFunction(x, n);
            e = Math.abs(yt - yn);
            System.out.printf("x = %10.10f,\tyt = %10.10f,\tyn = %10.10f,\te = %10.10f,\n", x, yt, yn, e);
            x += deltaX;
        }
    }

    public static void main(String [] args){
        System.out.println ("Начало табулирования");
        tabulation(0.8, 2.0, 0.2);
        System.out.println("Табулирование окончено");
        
    }
}

/*
int n = 10;
double minX = 0.8;
double maxX = 2.0;
double deltaX = 0.2;

выч корня for
табулир   while

 */