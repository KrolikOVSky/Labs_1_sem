public class Lab4{
    public static void main(String [] args){
        int x, z;
        double m, k;
        x = -4;
        z = 12;
        k = Math.pow(Math.E, Math.PI * x) * Math.cos(0.01) * z;
        m = (Math.sqrt(Math.exp(k) + Math.pow(10, 3)) - Math.sqrt(Math.pow(10, 3) - Math.exp(k))) / (Math.pow(x, 2) + 18 * x - 40);
        System.out.printf("x=%d; z=%d; m=%8.20f\n",x,z,m);
        System.out.println("Значение переменной а в формате IEEE 754: ");
        System.out.println(Long.toBinaryString(Double.doubleToLongBits (m)));
        
        System.out.println();
        
        x = 2;
        z = -6;
        k = Math.pow(Math.E, Math.PI * x) * Math.cos(0.01) * z;
        m = (Math.sqrt(Math.exp(k) + Math.pow(10, 3)) - Math.sqrt(Math.pow(10, 3) - Math.exp(k))) / (Math.pow(x, 2) + 18 * x - 40);
        System.out.printf("x=%d; z=%d; m=%8.20f\n",x,z,m);
        System.out.println("Значение переменной а в формате IEEE 754: ");
        System.out.println(Long.toBinaryString(Double.doubleToLongBits (m)));
    }
}