package second;

import first.Student;
import samples.StringExample;

public class Students {

    int d;
    String name;

    public Students(int d, String name) {
        this.d = d;
        this.name = name;
    }

    public static void main(String[] args)
    {
        Students s=new Students(2,"abc");

        Students s1=new Students(1,"ghj");

        Students sarray[]={s,s1};

        for (Students obj:sarray)
        {
            System.out.println(obj.d);
        }
    }
}
