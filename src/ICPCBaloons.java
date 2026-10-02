import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ICPCBaloons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next().toUpperCase();

            char[]arr=new char[n];
            for(int i=0;i<n;i++){
                arr[i] = s.charAt(i);
            }


            Set<Character>set1=new HashSet<>();
            for(char x:arr){
              set1.add(x);

            }
            int c=set1.size();

            System.out.println(n+c);

        }

    }
}
