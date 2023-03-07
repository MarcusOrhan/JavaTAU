package ArraysTrick;

import java.util.Scanner;
/*
Make an array that holds its actual values of the days of the week, and then have the user input a number corresponding to some day of the week. And assume that the week starts on Monday.
 */
public class DayOfTheWeek {
    private static String[] daysOfTheWeek;
    private static final Scanner scan = new Scanner(System.in) ;

    public static void main(String[] args) {

        System.out.println("Enter a number(1-7) to print corresponding day  of the week");
daysOfTheWeek= new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
int numberDay = scan.nextInt();

        System.out.println("Day of the week is: " + daysOfTheWeek[numberDay-1]);
    }


}
