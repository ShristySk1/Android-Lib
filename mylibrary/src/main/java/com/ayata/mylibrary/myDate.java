package com.ayata.mylibrary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class myDate {
    public static Date getDateToday() {
        Date todayDate = Calendar.getInstance().getTime();
        return todayDate;
    }
    public static String getDateTodayPattern(String pattern) {
        DateFormat formatter = new SimpleDateFormat(pattern);
        Date todayDate = Calendar.getInstance().getTime();
        return formatter.format(todayDate);
    }
}
