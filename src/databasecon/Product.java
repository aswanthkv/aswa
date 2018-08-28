package databasecon;

import java.sql.*;

public class Product {

    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
        Statement state=conn.createStatement();
        PreparedStatement ps=conn.prepareStatement("select avg(salary) from employee");
        PreparedStatement ps1=conn.prepareStatement("select * from product order by name");
        PreparedStatement ps2=conn.prepareStatement("select * from employee where salary>10000 and gender='male'");
        ResultSet r=ps.executeQuery();
        if(r.next())
        {
           System.out.println(r.getInt(1));
        }
        System.out.println("\n");

        ResultSet r1= ps1.executeQuery();
        while(r1.next())
        {
            System.out.println(r1.getString(1)+" "+r1.getString(2)+" "+r1.getString(3)+" "+r1.getString(4));
        }
        System.out.println("\n");

        ResultSet r2=ps2.executeQuery();
        while(r2.next())
        {
            System.out.println(r2.getInt(1)+" "+r2.getString(2)+" "+r2.getString(3)+" "+r2.getDouble(4));
        }
        System.out.println("\n");
        CallableStatement s=conn.prepareCall("{call operation(?)}");
        s.registerOutParameter(1,Types.INTEGER);
        s.execute();
        int x=s.getInt(1);
        System.out.println(x);
        System.out.println("\n");
        CallableStatement cs=conn.prepareCall("{call new_procedure(?)}");
        cs.setInt(1,2);
        cs.execute();
        ResultSet rr=state.executeQuery("select * from employee");
        while(rr.next())
        {
            System.out.println(rr.getInt(1)+" "+rr.getString(2)+" "+rr.getString(3)+" "+rr.getInt(4));
        }

        conn.close();
    }
}
