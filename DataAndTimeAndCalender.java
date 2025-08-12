package JavaBasics;

import java.util.Calendar;
import java.util.Date;

public class DataAndTimeAndCalender {
    public static void main(String[] args) {
        // it gives milli second from 1970 to current time.
        System.out.println("milli second ="+System.currentTimeMillis());

        // it gives  second from 1970 to current time.
        System.out.println(" second ="+System.currentTimeMillis()/1000);

        // it gives minute from 1970 to current time.
        System.out.println("minute ="+System.currentTimeMillis()/1000/3600);

        // it gives day  from 1970 to current time.
        System.out.println("day= "+System.currentTimeMillis()/1000/3600/24);

        // it gives month second from 1970 to current time.
       // System.out.println("month= "+System.currentTimeMillis()/1000/3600/24/31);

        // it gives years from 1970 to current time.
        System.out.println("years= "+System.currentTimeMillis()/1000/3600/24/365);

        //date

        Date d=new Date();
        System.out.println(d);

        //calender

        Calendar c= Calendar.getInstance();
        System.out.println(c);


    }
}
