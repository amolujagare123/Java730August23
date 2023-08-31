package DateDemo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    // Date to String conversion
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        String dateStr = sd.format(date);
        System.out.println("dateStr="+dateStr);

        //  → dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        String dateStr0 = sd0.format(date);
        System.out.println("dateStr0="+dateStr0);

        //→ dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm aa");
        String dateStr1 = sd1.format(date);
        System.out.println("dateStr1="+dateStr1);
        //→ yyyy-MM-dd | hh:mm:ss
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss aa");
        String dateStr2 = sd2.format(date);
        System.out.println("dateStr2="+dateStr2);


    }
}
