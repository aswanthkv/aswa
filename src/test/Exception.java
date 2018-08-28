package test;

public class Exception extends Throwable {


    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer exception");
        }
        System.out.println("Helo");

    }

}
