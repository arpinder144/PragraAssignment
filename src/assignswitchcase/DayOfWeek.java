package assignswitchcase;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any week day name:");
        String days= sc.nextLine();
        switch (days.toLowerCase()){
            case "monday":
                System.out.println("Monday is Weekday");
                break;
            case "tuesday":
                System.out.println("Tuesday is Weekday");
                break;
            case "wednesday":
                System.out.println("Wednesday is Weekday");
                break;
            case "thursday":
                System.out.println("thursday is Weekday");
                break;
            case "friday":
                System.out.println("Friday is Weekday");
                break;
            case "saturday":
                System.out.println("Saturday is weekend");
                break;
            case "sunday":
                System.out.println("Sunday is Weekend");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
