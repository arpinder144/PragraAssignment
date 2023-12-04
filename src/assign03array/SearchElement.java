package assign03array;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any element for search:");
        int element= sc.nextInt();
        int[] arr={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("element found:"+arr[i]);}
//            }else {
//                System.out.println("Searching Array not found yet!!");
//            }
        }
        System.out.println("Search Complete!!");

    }
}
