import java.util.*;
public class Recursin5 {
    public static void function(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        function(i-1,sum+i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        function(n,0);
    }
}
