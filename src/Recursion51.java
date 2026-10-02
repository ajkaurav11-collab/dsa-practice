//perameterized method to calculate the sum of the numbers;

import java.util.Scanner;

public class Recursion51 {
    public static int function(int n){
        if(n==0){
            return 0;
        }
        return n+function(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(function(n));
    }
}
