package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Bookmain extends Book
{

    public Bookmain(String bname, int price, String auther) {
        super(bname, price, auther);
    }

    public static void main(String[] args)
   {
       Bookmain b1 = new Bookmain("wings of fire", 34200, "apj");
       Bookmain b2= new Bookmain("hello world", 2000, "aswanth");
       Bookmain b3= new Bookmain("BHoom", 250, "asdfr");
       Bookmain b4= new Bookmain("wings", 2030, "rohit");
       Bookmain b5= new Bookmain("fire", 20540, "ashk");


       LinkedList<Bookmain> ll=new LinkedList<>();
       ll.add(b1);
       ll.add(b2);
       ll.add(b3);
       ll.add(b4);
       ll.add(b5);

       Iterator itr=ll.iterator();
       while(itr.hasNext())
       {
           Bookmain a=(Bookmain) itr.next();
           System.out.println(a.bname+" "+a.price+" "+a.auther);
       }

       for(Bookmain obj:ll)
       {
           if(ll.contains(b5))
               b5.bname="modified";
               break;
       }

       for(Bookmain b:ll)
       {
           System.out.println(b.bname+b.price+b.auther);
       }

   }



}
