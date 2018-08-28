package stream;

import samples.Pattern;

import java.util.regex.Matcher;

public class Regexex1 {

    public static void main(String[] args)
    {
//        System.out.println(java.util.regex.Pattern.matches("[\\D]{6}","aaaaaa"));
//        System.out.println(java.util.regex.Pattern.matches("[@&%]","@"));
        System.out.println(java.util.regex.Pattern.matches("[[a-z]+[A-Z][0-9]+]{10}","AAAAAAAAAA"));
//        System.out.println(java.util.regex.Pattern.matches("[[a-z]+[A-Z]*[0-9]+]{10}","ASWANTH123"));
//        System.out.println(java.util.regex.Pattern.matches("[a-zA-Z0-9]*[@][a-z]+[.][c][o][m]","aswanthkv1996@gmail.com"));
//        System.out.println(java.util.regex.Pattern.matches("[+][9][1][0-9]{10}","+919496024198"));

        boolean b=false;
        java.util.regex.Pattern p= java.util.regex.Pattern.compile("java");
        Matcher m=p.matcher("hi java,hello java");
        while(m.find())
        {
            System.out.println("found="+m.group()+"starting at index="+m.start()+"ending index at"+m.end());

            b=true;
        }
        if(b==false)
        {
            System.out.println("not found");
        }
    }

}
