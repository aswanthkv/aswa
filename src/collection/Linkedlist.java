package collection;
import java.util.LinkedList;

public class Linkedlist {//ll cannot be accesse by index;


    public static void main(String[] args)
    {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("rohit");
        ll.add("bhoom");
        ll.add("jishnu");
        ll.addFirst("aswanth");
        ll.addLast("ashok");
        ll.add(null);
        ll.add(null);
        ll.remove();
        ll.removeLast();

        ll.removeFirst();
        ll.remove(2);
        ll.remove("jishnu");



        for(String obj:ll)
        {
            System.out.println(obj);
        }

    }



}
