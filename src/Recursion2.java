import java.util.Scanner;

public class Recursion2 {

    public static void MyName(int i,int n){
        if(i>n){

            return;

        }
        System.out.println("kamal");

        MyName(i+1,n);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        MyName(1,n);
    }
}
