package assign03array;

import java.util.Scanner;

public class MaxMin {
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
        int high=arr[0];
        int small=arr[0];
        for(int j=1;j< arr.length;j++){
            if(arr[j]>high){
                high=arr[j];

            }
        }
        System.out.println("max number:"+high);
        for(int j=1;j< arr.length;j++){
            if(arr[j]<small){
                small=arr[j];

            }
        }
        System.out.println("min number:"+small);
    }

}
