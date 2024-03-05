import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        div3();
        Scanner in = new Scanner(System.in);
//        int x,y,z;
//        x = in.nextInt();
//        y = in.nextInt();
//        z = in.nextInt();
//        comp3(x,y,z);
        int f = in.nextInt();
        System.out.println(fib(f-1));
    }
    public static void div3()
    {
        for(int i = 3; i <= 99; i+= 3)
        {
            System.out.println(i);
        }
    }
    public static void comp3(int a, int b,int c)
    {
        if (a < b && b < c)
        {
            System.out.println(a + " < " + b + " < " + c);
        }
        else if (a < c && c < b)
        {
            System.out.println(a + " < " + c + " < " + b);
        }
        else if (b < a && a < c)
        {
            System.out.println(b + " < " + a + " < " + c);
        }
        else if (b < c && c < a)
        {
            System.out.println(b + " < " + c + " < " + a);
        }
        else if (c < a && a < b)
        {
            System.out.println(c + " < " + a + " < " + b);
        }
        else if (c < b && b < a)
        {
            System.out.println(c + " < " + b + " < " + a);
        }
        else {
            System.out.println("Numerele sunt egale sau în altă ordine.");
        }
    }
    public static int fib(int n)
    {
        if(n <= 2)
        {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}