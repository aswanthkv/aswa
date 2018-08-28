package Threads;


public class Sample {

    static synchronized public void display(int x)
    {
                  //lock is done on the perticular object;

            for (int i = 0; i < 3; i++) {
                System.out.println(i * x);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }System.out.println(Thread.currentThread().getName());


    }

}
