package com.zemosotraining.designprinciples.kiss;

public class KissDemo {
    public String weekdayM1(int dayOfWeek)
    {
        switch (dayOfWeek)
        {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: throw new IllegalArgumentException("dayOfWeek must be in range 1..7");
        }
    }

    public String weekdayM2(int dayOfWeek)
    {
        if ((dayOfWeek < 1) || (dayOfWeek > 7))
            throw new IllegalArgumentException("dayOfWeek must be in range 1..7");

        final String[] weekdays = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        return weekdays[dayOfWeek-1];
    }

    public static void main(String[] args) {
        KissDemo weekday = new KissDemo();
        System.out.println("Weekday returned by M1: " + weekday.weekdayM1(3));
        System.out.println("Weekday returned by M2: " + weekday.weekdayM2(3));
    }
}
