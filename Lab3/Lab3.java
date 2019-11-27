package Lab3;


public class Lab3
{
    public static void main(String [] args)
    {
        int a = 456;
        int b = 1234;
        int c;
        System.out.printf("a =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(a),a,a,a);
        System.out.printf("b =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(b),b,b,b);
        c = -a;
        System.out.printf("-a =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(c),c,c,c);
        c = a+b;
        System.out.printf("a+b =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(c),c,c,c);
        c = a-b;
        System.out.printf("a-b =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(c),c,c,c);
        c = a*b;
        System.out.printf("a*b =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(c),c,c,c);
        c = a/b;
        System.out.printf("a/b =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(c),c,c,c);
        c = a%b;
        System.out.printf("a%%b =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(c),c,c,c);
        a++;
        System.out.printf("a++ =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(a),a,a,a);
        b--;
        System.out.printf("b-- =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(b),b,b,b);
        a--;
        b++;        
        c = (2*a+b/45)*3%14;
        System.out.printf("(2*a+b/45)*3%%14 =%s(2)=%h(16)=%o(8)=%d(10)\n",Integer.toBinaryString(c),c,c,c);
    }
}
        
