package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Employeemain extends Employee{

    public Employeemain(String empname, int salary, String dept)
    {
        super(empname, salary, dept);
    }

    public static void main(String[] args)
    {
        ArrayList<Employee> e=new ArrayList();
        Employee e1=new Employee("jizu",23000,"cse");
        Employee e2=new Employee("tutu",45000,"it");
        Employee e3=new Employee("jimbru",453000,"maths");

        e.add(e1);
        e.add(e2);
        e.add(e3);

        for(Employee obj:e)
        {
            //System.out.println(obj.empname+" "+obj.salary+" "+obj.dept);
        }



        Iterator itrt=e.iterator();

        while(itrt.hasNext())
        {
            Employee obj=(Employee) itrt.next();
            System.out.println("empname="+obj.empname+" "+"salary="+obj.salary+" "+"Dept="+obj.dept);
        }
    }
}
