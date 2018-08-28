package second;
import second.AMethodOverriding;

public class BMethodOverriding extends AMethodOverriding {

    int d=1;
    int e=2;

    public BMethodOverriding() {
        super();
        System.out.println("Child class constctr");
    }
    //Method Overriding
    @Override
    public void display()
    {
        System.out.println("hello");
        super.display();//refer parent class
    }



    public static void main(String[] args)
    {
        BMethodOverriding obj=new BMethodOverriding();
        System.out.println("Properties of parent class "+obj.a+" "+obj.b);
        System.out.println("Properties of Child class"+obj.d+" "+obj.e);
        obj.display();
    }


}
