package amath.leetcode.easy;

public class Date {
    private int year, month, day;

    public Date(int year, int month, int day) {
        this.setDate(year,month,day);
    }

    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year>=1000 && year<=9999) {
            this.year = year;
        } else {
            this.year = 0;
            System.out.println("error: invalid year");
        }
    }
    public void setMonth(int month) {
        if (month>=1 && month<=12) {
            this.month = month;
        } else {
            this.month = 0;
            System.out.println("error: invalid month");
        }
    }
    public void setDay(int day) {
        if (day>=1 && day<=31) {
            this.day = day;
        } else {
            this.day = 0;
            System.out.println("error: invalid day");
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%4d", month, day, year);
    }

    public void setDate(int year, int month, int day) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }
}
