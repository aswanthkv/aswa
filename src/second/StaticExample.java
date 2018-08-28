package second;

public class StaticExample {

    static int i=1;
    int j=1;

    StaticExample()
    {
        ++i;
        ++j;
        System.out.println(i+" "+j);
    }

    static class InnerStatic{
        public void showMessage()
        {
            System.out.println("hello world");
        }
        public static void printfun()
        {
            System.out.println("static function of inner class");
        }
    }

    public static void display()
    {
        System.out.println("static function");
    }

    static {
        i=1;
        System.out.println("Static block");
    }

    public static void main(String[] args)
    {
        StaticExample s=new StaticExample();
        StaticExample s1=new StaticExample();
        System.out.println(i);
        display();
        InnerStatic.printfun();
        InnerStatic is=new InnerStatic();
        is.showMessage();

    }
}
