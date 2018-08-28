package map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    //unique elemts only ,cannot add null ;

    public static void main(String[] args)
    {
        TreeMap<Integer, String> t=new TreeMap<>();
        t.put(11,"asd");
        t.put(12,"dfdd");
        t.put(23,"aswanth");
        //t.put(null,"aaaa");


        for(Map.Entry<Integer, String> obj:t.entrySet())
        {
            System.out.println(obj.getValue());

        }
    }
}
