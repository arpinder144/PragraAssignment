package assign03array;

public class AddAllElement {
    public static void main(String[] args) {
        int[] input={10,20,30,40,50};
        int sum=0;

        for(int i=0;i<input.length;i++){
            sum+=input[i];
        }
        System.out.println("Sum of all array element:"+sum);
    }
}
