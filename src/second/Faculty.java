package second;

public class Faculty extends Department
{

    int fid;
    String fname;

    public Faculty(int did, String dname, int fid, String fname) {
        super(did,dname);
        this.fid = fid;
        this.fname = fname;
    }

    public void printdetails()
    {
        System.out.println("Department name is "+did+" Department name is "+dname+" Faculty id is "+fid+" Faculty name is "+fname);
    }

    public static void main(String[] args)
    {
        Faculty f=new Faculty(10,"CSE",101,"ABC");
        f.printdetails();
    }


}
