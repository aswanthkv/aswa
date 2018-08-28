package stream;

import java.util.Random;

public class Otp {
    public static void main(String[] args) {

        String cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String num="123456789";

        String value=cap+small+num;

        Random r=new Random();
        char[] password = new char[10];
        for(int i=0;i<10;i++)
        {
           password[i]=value.charAt(r.nextInt(value.length()));

        }
        System.out.println(password);
    }
}
