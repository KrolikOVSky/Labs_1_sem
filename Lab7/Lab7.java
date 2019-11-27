package Lab7;

public class Lab7{
    public static double fun (double x){
        double y=Math.sqrt(x);
        return y;
    }

    public static double funIter (double x, int n){
        double y=x;
        for (int i=1; i<=n; i++){
            y=(y+x/y)/2;
            //System.out.printf ("x=%10.6f, y=%10.6f, i=%4d\n",x,y,i);
        }
        return y;
    }

    public static void go (double startX, double endX, double deltaX){
        double x=startX,yt,yn,e;
        int n=5;
        while (x<=endX){
            yt=fun(x);
            yn=funIter(x,n);
            e=Math.abs(yt-yn);
            System.out.printf ("x=%10.6f, yt=%10.6f, yn=%10.6f, e=%10.6f\n",x,yt,yn,e);
            x=x+deltaX;
        }
    }

    public static void main ( ){
        System.out.println ("Начало табулирования");
        go(10,20,2);
        System.out.println ("Табулирование окончено");
        System.out.println ("Начало табулирования");
        go(2.5,3.5,0.1);
        System.out.println ("Табулирование окончено");
    } //main
} // class               