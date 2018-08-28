package parking;

import java.util.ArrayList;
import java.util.Scanner;

public class Park
{
    public static int type;
    public static int time;
    public static int opt;
    public static int number;
    public static int temp;


    static void twowheeladd(ArrayList<Integer> l1,int number)
    {
        int x=l1.size();
        System.out.println("size="+x);
        if(x<3)
        {
            l1.add(number);
        }
        else System.out.println("parking full");

    }

    static void fourwheeladd(ArrayList<Integer> l2,int number)
    {
        int x=l2.size();
        System.out.println("size="+x);
        if(x<3)
        {
            l2.add(number);

        }
        else System.out.println("parking full");

    }




    static void twowheelrem(int time,ArrayList<Integer> l1,int number)
    {

        System.out.println(l1);
        int x = l1.size();
        System.out.println("size=" + x);
        if (x > 0)
        {
            l1.remove(0);
            System.out.println("amount=" + (time * 25));
        }
        else System.out.println("vehicle not found");

    }

    static void fourwheelrem(int time,ArrayList<Integer> l2,int number)
    {


        for(int i=0;i<l2.size();i++){


            if(l2.get(i)==number){

                l2.remove(i);
            }


        }

        System.out.println(l2);
        int x=l2.size();
        System.out.println("size="+x);
        if(x<3)
        {
            System.out.println("amount="+(time*50));
        }
        else System.out.println("vehicle not found");

    }

    public static void main(String[] args)
    {
        //Park p=new Park();
        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();

        for(int i=0;i<20;i++)
        {

            Scanner sc = new Scanner(System.in);

            System.out.println("To add vehicle--press 1 \nto remove vehicle --press2");
            opt=sc.nextInt();
            if(opt==1)
            {
                System.out.println("Enter type of vehicle");
                type = sc.nextInt();
                System.out.println("enter vehicle number");
                number= sc.nextInt();

                if (type == 2) {
                    twowheeladd(l1,number);
                } else if (type == 4) {
                    fourwheeladd(l2,number);
                } else
                    System.out.println("invalid vehicle type");
            }
            else if(opt==2)
            {
                System.out.println("Enter type of vehicle");
                type = sc.nextInt();
                System.out.println("enter vehicle number");
                number= sc.nextInt();
                System.out.println("Enter time");
                time=sc.nextInt();

                if (type == 2) {
                    twowheelrem(time, l1,number);
                } else if (type == 4) {
                    fourwheelrem(time, l2,number);
                } else
                    System.out.println("invalid vehicle type");




            }
        }

    }


}


