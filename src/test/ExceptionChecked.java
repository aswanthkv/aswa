package test;

import java.io.IOException;

public class ExceptionChecked {

    public static void check() throws IOException//propogate checked exception
    {
        throw new IOException();
    }

    public static void callCheck() throws IOException
    {
        check();
    }

    public static void main(String[] args) {

        try {
            check();
            callCheck();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Checked Exception");
        }

    }
}
