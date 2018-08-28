package Set;

import java.util.LinkedHashSet;

public class Linkedhash
{
   public static void main(String[] args)
   {

       LinkedHashSet<String> lhs = new LinkedHashSet<>();
       lhs.add("aswanth");
       lhs.add("rohit");
       lhs.add("ashok");
       lhs.add("jishnu");
       lhs.add("jishn");

       for (String obj : lhs) {
           System.out.println(obj);
       }
   }


}
