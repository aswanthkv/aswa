package Test;

import java.util.Scanner;

public class Split_arrayinto2halfs {


    public static void main(String[] args) {
        int a[] = new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        int f;
        System.out.println("enter array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        f=(n/2);
        System.out.println("split size="+f);
        for(int i=0;i<f;i++)
        {
           b[i]=a[i];
        }
        int j,k;
        for(j=f;j<n;j++)
        {
            c[j]=a[j];
        }

        System.out.println("first array is");
        for(j=0;j<f;j++)
        {
            System.out.println(b[j]);
        }
        System.out.println("second array is");
        for(j=f;j<n;j++)
        {
            System.out.println(c[j]);
        }
    }
}
