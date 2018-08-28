package Threads;

class Thread1 extends Thread
{

    Sample s;
    Thread1(Sample s)
    {
        this.s=s;

    }
    public void run()
    {
        s.display(5);

    }
}
class Thread2 extends Thread
{

    Sample s;
    Thread2(Sample s)
    {
        this.s=s;
    }
        public void run()
    {
        s.display(100);
    }

}

public class Threadmain {

    public static void main(String[] args) {

        Sample s = new Sample();
        Thread1 t = new Thread1(s);
        Thread2 t1 = new Thread2(s);
        t.start();
        t1.start();
        Sample sa=new Sample();
        Thread1 t3 = new Thread1(sa);
        Thread2 t4 = new Thread2(sa);
        t3.start();
        t4.start();

    }
}
