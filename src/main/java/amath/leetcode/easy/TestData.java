package amath.leetcode.easy;

public class TestData {
    public static void main(String[] args) {
        Date day1 = new Date(2016,4,6);
        System.out.println(day1);

        day1.setYear(2012);
        day1.setMonth(12);
        day1.setDay(23);
        System.out.println(day1);
        System.out.println("Year is: "+day1.getYear());
        System.out.println("Month is: "+day1.getMonth());
        System.out.println("Day is: "+day1.getDay());

        day1.setDate(900,1,2);
        System.out.println(day1);
    }
}
