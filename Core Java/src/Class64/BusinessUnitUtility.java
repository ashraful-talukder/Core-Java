package Class64;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BusinessUnitUtility {
    
    public static Calendar getCalendarForNow(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new Date());
        return calendar;
    }
}
