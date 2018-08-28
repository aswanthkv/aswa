package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Example1 {

    public static void main(String[] args)
    {
        /* generic declaration */
        //array list mainatins order.
        ArrayList<String> al=new ArrayList();
        ArrayList<Integer> a=new ArrayList();
        List<String> al1=new ArrayList<>();
        ArrayList<String>al2=new ArrayList<String>();

        al.add("ashuk");
        al.add("jiz");
        a.add(1);
        a.add(45);
        a.add(3);

        al1.add("apple");
        al1.add("cherry");

        al.addAll(2,al1);
        al.remove(1);
        al.remove("apple");

        for(String obj:al) {
            System.out.println(obj);

        }
        for(int ob:a)
        {
                //System.out.println(ob);
        }

        Iterator itr=a.iterator();

        while(itr.hasNext()){
            //System.out.println(itr.next());
        }
        for(int i=0;i<al.size();i++)
        {
            //System.out.println(al.get(i));
        }

    }
}
