package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

    // String to Date Conversion
    public static void main(String[] args) throws ParseException {
        String dateStr = "08/25/2003";
        System.out.println(dateStr);
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println(date);

        //→ dd-MMMM-yyyy
        String dateStr0= "23-June-2016" ;
        System.out.println(dateStr0);
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println(date0);

        //→ dd | MMMM yy hh:mm
        String dateStr1= "23 | June 16  8:34";
        System.out.println(dateStr1);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(date1);


        //→ yyyy-MM-dd | hh:mm:ss
        String dateStr2= "2016-06-23 | 8:34:23";
        System.out.println(dateStr2);
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println(date2);


        String dateStr5= "8:34:22" ;
        System.out.println(dateStr5);
        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:ss");
        Date date5 = sd5.parse(dateStr5);
        System.out.println(date5);



    }
}
