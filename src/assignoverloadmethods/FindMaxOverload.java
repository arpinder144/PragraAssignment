package assignoverloadmethods;

import java.util.Scanner;

public class FindMaxOverload {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1= sc.nextInt();
        System.out.println("Enter number2:");
        int num2= sc.nextInt();
        System.out.println("Enter number3:");
        int num3= sc.nextInt();
       // System.out.println("Max of first two numbers:"+findMax(num1,num2));
        //System.out.println("Max of three numbers:"+findMax(num1,num2,num3));
        FindMaxOverload f=new FindMaxOverload();
        System.out.println(f.findMax(num1, num2));

    }
    public  int findMax(int num1,int num2){
        return (num1>num2)?num1:num2;
    }
    public  int findMax(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            return num1;
        } else if (num2>num3) {
            return num2;
        }else {
            return num3;
        }
    }
}
