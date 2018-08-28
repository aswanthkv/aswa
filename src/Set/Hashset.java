package Set;

import java.util.HashSet;

public class Hashset {

    public static void main(String[] args)
    {
        HashSet<String> h=new HashSet<>();
        h.add("Aswanth");
        h.add("Ahok");
        h.add("jishnu");
        h.add(null);

        for(String obj:h)
        {
            System.out.println(obj);
        }

    }
}
