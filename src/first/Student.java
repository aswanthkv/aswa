package first;

public class Student {

    int rollno;
    String name;

    Student(int r,String n)
    {
        rollno=r;
        name=n;
    }

    void display()
    {
        System.out.println("Name is "+name+" Roll Number is "+rollno);
    }

    public static void main(String[] args)
    {
        Student s=new Student(10,"abc");
        s.display();

    }


}
