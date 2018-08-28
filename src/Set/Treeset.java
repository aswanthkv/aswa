package Set;

import java.util.TreeSet;

public class Treeset //used to store in ascending order and cannot add null value;
{



    public static void main(String[] args)
    {

        TreeSet<String> h = new TreeSet<>();
        h.add("Aswanth");
        h.add("Ahok");
        h.add("jishnu");
        h.add("zombie");

        //h.add(null);

        for (String obj : h) {
            System.out.println(obj);
        }



    }


}
