package functinterface;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streamexample {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(9);
        Stream<Integer> s=al.stream();
       // s.filter(x-> x>2).forEach(m-> System.out.println(m)); //here x and m is called predicate
        s.map(item->item*item).forEach(z-> System.out.println(z));



        ArrayList<String> ar=new ArrayList<>();
        ar.add("one");
        ar.add("two");
        ar.add("Three");
        ar.stream().filter(j->j.contains("T")).forEach(q-> System.out.println(q));
    }
}
