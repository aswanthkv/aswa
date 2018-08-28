package awt;

import java.util.Random;

import static java.lang.Float.max;
import static java.lang.Math.abs;
import static java.lang.Math.ceil;
import static java.lang.StrictMath.acos;

public class Commonmethods {

    public static int getfib(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        return getfib(n-1)+getfib(n-2);
    }
    public static int fact(int v) {

        int f=v;
        f=fact(v-1);
        return f;

    }

    public static void main(String[] args)
    {
        System.out.println(abs(-10));
        System.out.println(max(10,12));
        System.out.println(acos(-1));
        System.out.println(ceil(6));
        Random random=new Random();
        int i=random.nextInt(100);
        System.out.println(i);
        int a=getfib(10);
        System.out.println(a);
        //int fa=fact(3);
        //System.out.println(fa);
    }
}
