package Set;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

public class Cmp implements Comparable<Cmp>
{
    int rollno;
    String name;
    int age;

    Cmp(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args)
    {
        TreeSet<Cmp> t=new TreeSet<Cmp>();
        t.add(new Cmp(11,"sdfg",42));
        t.add(new Cmp(13,"sdrrgfsdr",24));
        t.add(new Cmp(14,"asdvssadsffa",30));

        for(Cmp obj:t)
        {
            System.out.println(obj.rollno);
        }

    }


    public int comparableTo(Cmp obj)
    {
        if(rollno>obj.rollno)
            return 1;
        else if(rollno<obj.rollno)
            return -1;
        else
            return 0;
    }

    @Override
    public int compareTo(@NotNull Cmp o) {
        if(rollno>o.rollno)
            return 1;
        else if(rollno<o.rollno)
            return -1;
        else
            return 0;
    }
}
