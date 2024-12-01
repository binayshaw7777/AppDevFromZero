package com.binayshaw7777.appdevfromzero.util;

import java.util.Calendar;
import java.util.TimeZone;

/***
 * This class is used to get the greeting message based on the current time.
 * The getGreeting method takes an Integer hour as an argument and returns the greeting message.
 * If the hour is null, it will get the current hour from the system.
 */
public class TimeUtil {
    public static String getGreeting(Integer hour) {
        int currentHour;

        if (hour == null) {
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        } else {
            currentHour = hour;
        }

        System.out.println("Current Hour: " + currentHour);

        if (currentHour >= 5 && currentHour < 12) {
            return "Good Morning";
        } else if (currentHour >= 12 && currentHour < 17) {
            return "Good Afternoon";
        } else if (currentHour >= 17 && currentHour < 21) {
            return "Good Evening";
        } else {
            return "Good Night";
        }
    }
}
