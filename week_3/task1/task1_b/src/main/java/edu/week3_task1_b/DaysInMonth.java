package edu.week3_task1_b;

public class DaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        else if (month == 2 && isLeapYear(year) == false) {
            return 28;
        }
        else if (month == 2 && isLeapYear(year) == true) {
            return 29;
        } else {
            return -1;
        }
    }
}

