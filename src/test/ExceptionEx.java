package test;

import java.io.IOException;

public class ExceptionEx
{
    /*public static void add(int x,int y)
    {
        int z=x+y;
        if (z>50)
        {
            throw new ArithmeticException("not valid");
        }
    }*/

    public static void first()
    {
        second();
        }
        public static void second()
        {
            third();
        }
        public static void third()
        {
            throw new ArithmeticException("caught");
        }

    public static void main(String[] args) {
       /* try {
            add(50, 7);
        }
        catch (java.lang.Exception e)
        {
            System.out.println("Caught");
        }
        */
       try{
           first();
       }
       catch (java.lang.Exception e)
       {
           System.out.println("Exception caught");
       }


    }

    }
