package second;

class Polymorphism {

    //Compile time Polymorphism orMethod Overloading

    public void display()
    {
        System.out.println("display");
    }

    public void display(String msg)
    {
        System.out.println(msg);
    }

    public static void main(String[] args)
    {
        Polymorphism p=new Polymorphism();
        p.display();
        p.display("Hello ");
    }




}


