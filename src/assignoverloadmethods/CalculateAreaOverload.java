package assignoverloadmethods;

import java.util.Scanner;

public class CalculateAreaOverload {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        double length= sc.nextDouble();
        System.out.println("enter width");
        double width= sc.nextDouble();
        System.out.println("Area of rectangle:"+calculateArea(length,width));
        System.out.println("enter side");
        double side= sc.nextDouble();
        System.out.println("Area of square:"+calculateArea(side));


    }
    public static double calculateArea(double length, double width){
        return length*width;
    }
    public static double calculateArea(double side){
        return side*side;
    }
}
