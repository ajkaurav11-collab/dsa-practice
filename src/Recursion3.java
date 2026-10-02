import java.util.Scanner;

public class Recursion3 {
    public static void linear(int i,int n){
        if(i>n){
            return;
        }

        System.out.println(i);
        linear(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Your linear values are:");
        linear(1,n);

    }}
