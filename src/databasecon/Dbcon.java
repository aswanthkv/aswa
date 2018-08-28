package databasecon;

import java.sql.*;

import static java.lang.Class.forName;

public class Dbcon {

    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
       // Statement state=conn.createStatement();
        //int i=state.executeUpdate("insert into student values(2,'babu')");// i returns true if operation is done;
        //System.out.println(i);
        //state.executeUpdate("delete from student where id='9'");
        //state.executeUpdate("update student set age=18,name='lakshmi' where id=5") ;
        //PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?)");
        //ps.setInt(1,8);
        //ps.setString(2,"nikhil");
        //ps.setInt(3,22);
        //ps.executeUpdate();
        //PreparedStatement ps1=conn.prepareStatement("select * from student where id=?");
       // ps1.setInt(1,5);
        //ResultSet r=ps1.executeQuery();
        CallableStatement s=conn.prepareCall("{call newprocedure1(?,?,?)}");
        s.setInt(1,100000);
        s.setString(2,"jishnu");
        s.registerOutParameter(3,Types.INTEGER);
        s.execute();
        int x=s.getInt(3);
        System.out.println(x);


//        ResultSet rss=s.getResultSet();
//        if(r.next())
//        {
//            System.out.println(r.getInt(1)+" "+r.getString("name")+" "+r.getInt(3));
//        }
       // ResultSet rs=state.executeQuery("select * from student");
//        while(rss.next())
//        {
//            System.out.println(rss.getInt(1)+"  "+rss.getString("empname")+" "+rss.getString(4));
//        }

        conn.close();
    }
}
