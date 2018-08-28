package Threads;

public class Threadex extends Thread {

    @Override
    public void run()
    {
        System.out.println("Thread in excution");
    }
    public static void main(String[] args)
    {
        Threadex t=new Threadex(); //only if we start a thread then its run menthod can be invoked and executed;
        t.start();
        Threadex t1=new Threadex();
        t1.start();
        System.out.println("main thread");
    }


}
