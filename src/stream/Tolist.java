package stream;

import java.io.*;
import java.util.ArrayList;

public class Tolist {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Tolist");
        fw.write("aswanth and jishnu");
        fw.close();
        FileReader fr = new FileReader("Tolist");

        ArrayList<String> ar = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Tolist"));
        String s = br.readLine();
        String[] ch = s.split(" ");
        for (String obj : ch)
            ar.add(obj);
        for (String o : ar)
            System.out.println(o);
    }
}
