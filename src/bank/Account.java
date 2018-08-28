package bank;

/**
 * Created by aswanth on 7/4/18.
 */
public class Account extends Bank{
    int bal;
    int accid;
    int id;
    String name;
    int amount;
    Account(int accid,int bal,String name,String bankname,int bankid)
    {
        super(bankname,bankid);
        this.accid=accid;
        this.bal=bal;
        this.name=name;
    }
    static void display(int id,Account accno[])
    {
        for(Account i:accno)
        {
            if(i.accid==id) {
                System.out.println("accid=" + i.accid + " " + "balance=" + i.bal + " " + "name=" + i.name +" "+"bankname="+i.bankname+" "+"bankid="+i.bankid);
            }
        }
    }
    static void deposit(int amount,int id,Account accno[])
    {
        System.out.println("DEPOSIT"+"\n"+"credit amount="+amount);

        for(Account i:accno)
        {
            if(i.accid==id)
            {
                i.bal=i.bal+amount;
                display(id,accno);
            }

        }

    }
    static void retrive(int amount,int id,Account accno[])
    {

        for(Account i:accno)
        {
            if(i.accid==id)
            {
                i.bal=i.bal-amount;
                display(id,accno);
            }

        }

    }
    public static void main(String[] args)
    {
        Account a1=new Account(123,5000,"ashok","axis",1);
        Account a2=new Account(321,6400000,"raju","sbi",2);
        Account a3=new Account(213,234000,"jishnu","canara",3);
        Account accno[]={a1,a2,a3};
        display(123,accno);
        deposit(45000,123,accno);
        retrive(200,123,accno);
        display(321,accno);
        deposit(34567,321,accno);


        //public void setName(parameter) method is used to set value to a private varivable outside class;
        //public datatype getName() is used to get value of a private var and iyts content will be a return
    }

}
