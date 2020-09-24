package Class64;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddDayToDate {
    
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
        System.out.println("Date is : " + sdf.format(c1.getTime()));
        System.out.println("Next 7 dates from the date are: ");
        for (int i = 1; i < 8 ; i++){
            c1.add(Calendar.DATE, i);
            System.out.println(sdf.format(c1.getTime()));
            c1 = Calendar.getInstance();
        }
    }
}
