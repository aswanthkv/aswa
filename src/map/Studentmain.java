package map;

import java.util.HashMap;
import java.util.Map;

public class Studentmain {



    public static void main(String[] args)
    {
       // HashMap<Integer,String> hmap=new HashMap<>();
        HashMap<Integer, Stud> haha=new HashMap<>();


//        hmap.put(11,"ashok");
//        hmap.put(12,"aswanth");
//        hmap.put(41,"jish");
//        hmap.put(null,"alan");
//        hmap.put(41,"balan");
//        hmap.remove(12);
//        for(Map.Entry obj:hmap.entrySet())
//            System.out.println("key:" + obj.getKey() + " " + "value:" + obj.getValue());

        haha.put(12,new Stud(2,"asdfg","ashok"));
        haha.put(12,new Stud(3,"agfr","aswanth"));
        haha.put(12,new Stud(2,"ag","jish"));

        for(Map.Entry<Integer,Stud> ob:haha.entrySet()) {
            Stud n = ob.getValue();
            System.out.println("name=" + n.name + "age=" + n.age + "adress=" + n.adress);
        }


    }
}
