package samples;

import java.util.Scanner;

public class Leap {
    int c;

    void check(int year)
    {

        if (year%400==0)
        {
            c=1;
        }
        else if (year%100==0)
        {
            c=0;
        }
        else if (year%4==0)
        {
            c=1;
        }
        else
        {
            c=0;
        }
        if (c==1)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Normal Year");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year");
        int y=sc.nextInt();
        Leap l=new Leap();
        l.check(y);

    }
}
