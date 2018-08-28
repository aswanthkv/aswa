package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkhmap {//only diff with map is this one mainatins insertion order;


    public static void main(String[] args)
    {
        LinkedHashMap<String,String> h=new LinkedHashMap<>();
        h.put("11","asd");
        h.put("12","dfdd");
        System.out.println(h.containsKey("11"));

                for(Map.Entry<String,String> obj:h.entrySet())
        {
            System.out.println(obj.getValue());
            System.out.println(obj.getKey());
        }
    }
}
