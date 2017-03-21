/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarParkSystem;

import java.util.*;

/**
 *
 * @author THUSHAN
 */
public class DateTime {

    static Scanner sc = new Scanner(System.in);
    //define a date
    String yearChecker = "[2-9]\\d{3}";
    String monthChecker = "(0[1-9]|1[0-2])";
    String dateChecker = "((1|2)\\d|3(0|1)|0[1-9]|[1-9])";

    String hourChecker = "([0|1]\\d|2[0-4])";
    String minuteChecker = "([0-5]\\d|60)";

    private int year;
    private int month;
    private int date;
    private int hour;
    private int minute;

    //check date validation for the user inputs using pattern checker
    public void setDate(String userDate) {
        if (userDate.matches(yearChecker + "\\/" + monthChecker + "\\/" + dateChecker)) {
            String[] dateSeperater = (userDate.split("\\/"));
            year = Integer.parseInt(dateSeperater[0]);
            month = Integer.parseInt(dateSeperater[1]);
            date = Integer.parseInt(dateSeperater[2]);
        } else if (userDate.matches(dateChecker + "\\/" + monthChecker + "\\/" + yearChecker)) {
            String[] dateSeperater = (userDate.split("\\/"));
            year = Integer.parseInt(dateSeperater[2]);
            month = Integer.parseInt(dateSeperater[1]);
            date = Integer.parseInt(dateSeperater[0]);
        } else {
            System.out.println("invalid date,please enter date on \"DD/MM/YYYY\" or \"YYYY/MM/DD\" format: ");
            setDate(sc.next());
        }
    }
    //check time validation for the user inputs using pattern checker
    public void setTime(String userTime) {
        if (userTime.matches(hourChecker + "\\:" + minuteChecker)) {
            String[] timeSeperater = (userTime.split("\\:"));
            hour = Integer.parseInt(timeSeperater[0]);
            minute = Integer.parseInt(timeSeperater[1]);

        } else {
            System.out.println("invalid time,please enter time on \"HH:mm\" format: ");
            setTime(sc.next());
        }
    }
    //public methods to return year,month,date,hour and minute
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getdate() {
        return date;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    //DateTime's toString method
    public String toString() {
        return String.format("\n DATE: %d/%d/%d  TIME: %d:%d\n", year, month, date, hour, minute);
    }

}
