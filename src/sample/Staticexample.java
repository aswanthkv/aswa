package sample;

/**
 * Created by aswanth on 7/4/18.
 */
public class Staticexample {
    static int i=1;//if static all the obj hAVE SAME REFERENCE ie to same loction;
    int j=1;
    Staticexample()
    {
        ++i;
        ++j;
        System.out.println(i+" "+j);

    }
    public static void display()
    {
        System.out.println("static function");
    }
    static class innerclass{
    public void msg()
    {
        System.out.println("hello");
    }
    public static void printfun()
    {
        System.out.println("static function of inner class");
    }
    }
    static{//this is static block which is maily used for initializtn and will work first without call or obj creation
        System.out.println("static block");
    }
    public static void main(String[] args)
    {
        Staticexample s=new Staticexample();
        //Staticexample s1=new Staticexample();
        //Staticexample s2=new Staticexample();
        System.out.println(s.j+" "+Staticexample.i);// since i is static it can be accesed with class name also
        display();
        innerclass.printfun();
        innerclass s1=new innerclass();
        s1.msg();

    }
}
