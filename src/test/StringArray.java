package test;

public class StringArray {

    public static void main(String[] args) {

        String s="hi,hello,how,r u";

        String[] a=s.split(" ");

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        Object[] objects={1,"tyu",456,10.0f};
        for (Object obj:objects)
        {
            System.out.println(obj);
        }



    }

}
