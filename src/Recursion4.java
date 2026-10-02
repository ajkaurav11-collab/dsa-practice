import java.util.Scanner;

public class Recursion4 {
    public static void Reverse(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(n);
        Reverse(i,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Your reverese values are:");
        Reverse(1,n);
    }
}
