package sample;

/**
 * Created by aswanth on 7/4/18.
 */
public class Faculty extends Dept{
    int fid;
    String name;
    public Faculty(int deptid,String deptname,int fid,String name)
    {
        super(deptid,deptname);
        this.fid=fid;
        this.name=name;
    }
    public void printdetails(){
        System.out.println("deptid="+super.deptid+" "+super.deptname+" "+fid+" "+name);
    }
    public static void main(String[] args)
    {
        Faculty f=new Faculty(101,"cse",2,"jishnu");
        f.printdetails();
    }
}
