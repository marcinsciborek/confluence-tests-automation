package com.confluence.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
    public static String getCurrentDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(new Date());
    }

    public static String getCurrentDateTime(){
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("MM/dd/yyy hh:mm");
        return dateTimeFormat.format(new Date());
    }
}
