package stream;

import map.Stud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Filehwmain {

    int id;
    String name;
    int age;
    Filehwmain(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;

    }

    public static void main(String[] args)throws IOException
    {
        String str;
        BufferedReader br=new BufferedReader(new FileReader("a.text"));
        ArrayList<Filehwmain> ar=new ArrayList<>();
        while((str=br.readLine())!=null)
        {
            String[] x= str.split(",");
            ar.add(new Filehwmain(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));

        }

        for(Filehwmain obj:ar)
        {
            System.out.println("id="+obj.id+"  "+"name="+obj.name+"  "+"age"+obj.age);
        }




    }

}
