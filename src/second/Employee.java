package second;

import java.util.Scanner;

public class Employee {

    public int add(int x,int y)
    {
        return x+y;
    }

    public static void main(String[] args)
    {

        Department d1=new Department(233,"QWE");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two values");
        int a= sc.nextInt();
        int b=sc.nextInt();
        Employee em=new Employee();
        em.add(a,b);

    }
}
