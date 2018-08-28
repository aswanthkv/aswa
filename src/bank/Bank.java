package bank;

/**
 * Created by aswanth on 7/5/18.
 */
public class Bank {
    String bankname;
    int bankid;

    //int accno;
    public Bank() {

    }

    public Bank(String bankname, int bankid) {
        //this.accno=accno;
        this.bankname = bankname;
        this.bankid = bankid;

    }

    private int g = 20;
    private int m=526452;

    public void setName(int g) {
      this.g = g;
     System.out.println("g="+g);

    }
    public int getName() {
     return m;
    }







}
