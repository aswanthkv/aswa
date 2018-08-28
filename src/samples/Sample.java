package samples;

import java.util.Scanner;

public class Sample {

    public static void main(String[] args)
    {
        String str[]=new String[5];
        System.out.println("ENter 5 string");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            str[i]=sc.nextLine();
        }
        System.out.println("Strings are");
        for (String obj:str)
        {
            System.out.print(obj+ " ");
        }


    }
}
