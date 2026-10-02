import java.util.*;
public class Round {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int place=1;
        for(int i=0;i<n;i++) {
            sc.nextInt();

            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    count++;
                }
                n = n / 10;
              
            }
        }
        System.out.println(count);


    }
}
