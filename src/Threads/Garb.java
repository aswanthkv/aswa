package Threads;

public class Garb {

    @Override
    protected void finalize() {

            System.out.println("before garbage collection");
        }
        public static void main(String[] args)
        {
            Garb s=new Garb();
            s=null;
            Garb s1=new Garb();
            s1=null;
            System.gc();

        }
    }


