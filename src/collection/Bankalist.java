package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Bankalist {

    String bankname;
    String username;
    int accno;
    int balance;
    int acnumb;
    int amount;
    static int f=0;


    public Bankalist(String bankname,String username,int accno,int balance)
    {
        this.bankname=bankname;
        this.username=username;
        this.accno=accno;
        this.balance=balance;
    }





    static void display(int acnumb, ArrayList<Bankalist> bk)
    {

        for(Bankalist obj:bk)
        {
            if(obj.accno==acnumb)
            {
                System.out.println("accid=" + obj.accno + " " + "balance=" + obj.balance + " " + "name=" +obj.username +" "+"bankname="+obj.bankname+" "+"balance"+obj.balance);
            }

        }



    }
    static void deposit(int acnumb,ArrayList<Bankalist> bk,int amount)
    {
        {
            for(Bankalist obj:bk)
                if(obj.accno==acnumb)
                {
                    obj.balance=obj.balance+amount;
                    System.out.println("CREDITED");
                    display(acnumb,bk);
                }
        }
    }

    static void retrive(int acnumb,ArrayList<Bankalist> bk,int amount)
    {
        {
            for(Bankalist obj:bk)
                if(obj.accno==acnumb)
                {
                    obj.balance=obj.balance-amount;
                    System.out.println("DEBITED");
                    display(acnumb,bk);
                }
        }
    }

    static void removed(int acnumb,ArrayList<Bankalist> bk)
    {
        {
            for(Bankalist obj:bk)
            {
                if(obj.accno==acnumb)
                {
                    bk.remove(obj);
                    System.out.println("account"+acnumb+"removed");
                    break;
                }

            }
        }
    }
    public static void main(String[] args)
    {

        Bankalist b1=new Bankalist("Canara","aswanth",321321,34000);
        Bankalist b2=new Bankalist("axis","ashok",321123,44000);
        Bankalist b3=new Bankalist("federal","rohit",321213,54000);
        Bankalist b4=new Bankalist("sib","jishnu",123123,67541);


        ArrayList<Bankalist> bk=new ArrayList();

        bk.add(b1);
        bk.add(b2);
        bk.add(b3);
        bk.add(b4);

        System.out.println();

        display(123123,bk);
        deposit(123123,bk,230);
        retrive(123123,bk,100);
        removed(123123,bk);
        display(123123,bk);


        ArrayList al=new ArrayList();
        al.add(1);
        al.add("asw");
        al.add(1.3f);

        System.out.println(al);//without using for each loop we can print it;

        for(Object o:al)
            System.out.println(o);

    }
}
