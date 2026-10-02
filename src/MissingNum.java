import java.util.Scanner;
public class MissingNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int asum=0;
        int isum=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            asum=asum+arr[i];

        }
        while(n>0){
            isum=isum+n;
            n=n-1;
        }

        System.out.println(asum);
        System.out.println(isum);
        System.out.println(isum-asum);
    }
}
