package assign03array;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array:");
        int size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter element of array");
        for(int i=0;i< arr.length;i++){
            System.out.println("index:"+i+" =");
            arr[i]=sc.nextInt();
        }
        for (int element:arr
        ) {
            System.out.println("   "+element);

        }
        /////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(int element:arr){
            if(element%2==0){
                System.out.println("even no.:"+element);
            }
            else{
                System.out.println("Odd no.:"+element);
            }
        }

    }
}
