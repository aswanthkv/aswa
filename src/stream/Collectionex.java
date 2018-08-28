package stream;

import java.util.ArrayDeque;

public class Collectionex {
    public static void main(String[] args)
    {
        ArrayDeque<String> obj=new ArrayDeque<>();
        obj.addFirst("aswanth");
        obj.addLast("rohit");
        obj.add("aaaaa");
        obj.add("bbbbb");
        obj.add("ccccc");
        System.out.println(obj);
        System.out.println("head="+obj.peek());//return the first element;
        System.out.println("removed first"+obj.pollFirst());//remove and return first element and return null if empty;
        System.out.println("removedlast"+obj.pollLast());//remove and return last element and return null if empty;
        System.out.println("after removal"+obj);
        System.out.println(obj.remove());//remove first;
        System.out.println(obj.removeFirst());//remove and return first element;
        System.out.println(obj.removeLast());//remove and return last elemnt;
        System.out.println(obj);

    }
}
