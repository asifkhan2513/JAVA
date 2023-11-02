// package Calendar;
// import java.util.*;
import java.util.Calendar;

import java.util.*;

class Normal{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); 
        // System.out.println(calendar);
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeZone().getID());
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println((calendar.get(Calendar.HOUR_OF_DAY)));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)+" : "+calendar.get(Calendar.MINUTE)+" : "+calendar.get(Calendar.SECOND));
    }
}