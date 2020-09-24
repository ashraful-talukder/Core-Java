package Class64;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayNameFromDate {
    
    public static void main(String[] args) throws ParseException {
        String input_date = "19/09/2020";
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = format1.parse(input_date);
        DateFormat format2 = new SimpleDateFormat("EEEE");
        DateFormat format3 = new SimpleDateFormat("EE");
        String fullDay = format2.format(dt1);
        String shrotDay = format3.format(dt1);
        System.out.println(fullDay);
        System.out.println(shrotDay);
    }
}
