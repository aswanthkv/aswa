import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args)
    {
        try{
            Socket s=new Socket("localhost",5555);
            DataOutputStream out=new DataOutputStream(s.getOutputStream());
            out.writeUTF("hello my boy from server");
            out.flush();
            out.close();


        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
