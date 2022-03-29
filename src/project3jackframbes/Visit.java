/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3jackframbes;

/**
 * Class for all visits to gather who visited and gets the date and time
 *
 * @author jfram
 */
public class Visit {

    private Customer visitor;
    private String date; // mm/dd/yy 
    private String time; // hh:mm where hh is 24-hour time 

    /**
     * Constructor for class visit
     *
     * @param v the Customer information
     * @param d the date of the visit
     * @param t the time of the visit
     */
    public Visit(Customer v, String d, String t) {
        date = d;
        time = t;
        visitor = v;
    }

    /**
     * gets the information of the visitor
     *
     * @return visitor
     */
    public Customer getVisitor() {
        return visitor;
    }

    /**
     * gets the month of the visit
     *
     * @return int month
     */
    public int getMonth() {
        String mdate = date.substring(0, 2);
        int month = Integer.parseInt(mdate);
        return month;
    }

    /**
     * gets the day of the visit
     *
     * @return int day
     */
    public int getDay() {
        String ddate = date.substring(3, 5);
        int day = Integer.parseInt(ddate);
        return day;
    }

    /**
     * returns the year of the visit
     *
     * @return int year
     */
    public int getYear() {
        String ydate = date.substring(6, 10);
        int year = Integer.parseInt(ydate);
        return year;
    }

    /**
     * returns the hour of the visit
     *
     * @return int hour
     */
    public int getHour() {
        String htime = time.substring(0, 2);
        int hour = Integer.parseInt(htime);
        return hour;
    }

    /**
     * returns the minute of the visit
     *
     * @return int minute
     */
    public int getMinute() {
        String mtime = time.substring(3, 5);
        int minute = Integer.parseInt(mtime);
        return minute;
    }

    /**
     * toString returing the date, time, and the visitor information
     *
     * @return date,time,visitor
     */
    public String toString() {
        return date + " " + time + " " + visitor;
    }
    
}
