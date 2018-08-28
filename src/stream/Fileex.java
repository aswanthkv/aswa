package stream;

import java.io.*;

public class Fileex {

    public static void main(String[] args) throws IOException {
//        FileOutputStream fout=new FileOutputStream("first.txt");
//        //fout.write(100);
//        String s="java";
//        byte[] b=s.getBytes();
//        fout.write(b);
//        fout.close();
//
//        FileInputStream fin=new FileInputStream("first.txt");
//        int t=0;
//        while((t=fin.read())!=-1)
//        System.out.print((char) t);



        //using file writer we can give char directly bcoz its a char oriented stream;
        FileWriter w=new FileWriter("second.txt");
        w.write("hello brother");
        w.close();
        FileReader r=new FileReader("second.txt");
        int ch=0;
        while((ch=r.read())!=-1)
        {
            //char aa=(char) ch;
            FileWriter fw=new FileWriter("work");
            fw.write(ch);
            fw.close();
            FileReader fr=new FileReader("work");
            int k=0;
            if((k=fr.read())!=-1)
                System.out.print((char) k);


        }


    }
}
