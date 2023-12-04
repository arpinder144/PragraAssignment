package assign03array;

import java.util.Scanner;

public class ReverseElemnetArray {
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

        int temp=0;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[size-1];
            arr[size-1]=temp;
            size--;
        }
        System.out.println("Reversed Array:");
        for (int element:arr
        ) {
            System.out.println("   "+element);

        }

    }
}
