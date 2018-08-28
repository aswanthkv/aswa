package Threads;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datee {

    public static void main(String[] args)
    {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format.format(date));

        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        LocalTime time=LocalTime.now();
        System.out.println(time);

        GregorianCalendar cal=new GregorianCalendar();
        //int year=cal.get(calendar.YEAR);
        System.out.println(cal.getTime());
    }

}
