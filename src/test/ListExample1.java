package test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {

        //general declaration
        ArrayList<String> al=new ArrayList();
        List<String> al1=new ArrayList<>();
        ArrayList<String>al2=new ArrayList<String>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("A");
        al.add("C");

        for (String o:al)
        {
            System.out.println(o);
        }

        ArrayList<Integer> ai=new ArrayList<Integer>();
        ai.add(4);
        ai.add(6);
        ai.add(3);
        ai.add(64);

        for (Integer o:ai)
        {
            System.out.println(o);
        }

        Iterator itr=ai.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        for (int i=0;i<ai.size();i++)
        {
            System.out.println(ai.get(i));
        }


    }



}
