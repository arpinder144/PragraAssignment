package assignoverloadmethods;

public class PrintInfoOverload {
    public static void main(String[] args) {
        printInfo(4);
        printInfo(4.5,"hello");
    }
    public static void printInfo(int a){
        System.out.println("int:"+a);
    }
    public static void printInfo(double a,String b){
        System.out.println("double:"+a);
        System.out.println("String:"+b);
    }
}
