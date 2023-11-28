package assignmethods;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius:");
        double r= sc.nextDouble();
        System.out.println("area of circle:"+area(r));

    }
    public static double area(double radius){
        return 3.14*radius*radius;
    }
}
