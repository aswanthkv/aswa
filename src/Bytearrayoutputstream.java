import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytearrayoutputstream {

    //which is used to put same data to diff files;

    public static void main(String[] args) throws IOException {

        String s = "hello world";
        byte[] v= s.getBytes();

        FileOutputStream out1=new FileOutputStream("bytearrayoutstream1.txt");
        FileOutputStream out2=new FileOutputStream("bytearrayoutputstream2.txt");

        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write(v);
        baos.writeTo(out1);
        baos.writeTo(out2);

    }

}
