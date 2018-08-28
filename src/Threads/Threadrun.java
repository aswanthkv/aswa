package Threads;

public class Threadrun implements Runnable {

    public void run()
    {
        for(int i=0;i<5;i++) {


            System.out.println(Thread.currentThread().getName());
            System.out.println("thread in execution");
            System.out.println(i);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args)
    {
        Threadrun obj=new Threadrun();
        Thread t=new Thread(obj);
        t.setName("mythread1");
        t.start();
        Thread t2=new Thread(obj);
        t2.setName("mythread2");
        t2.start();
        System.out.println("main thread");
    }
}
