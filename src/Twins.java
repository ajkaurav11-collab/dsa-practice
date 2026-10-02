import java.util.Arrays;
import java.util.Scanner;
public class Twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        int total=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int merasum=0,count=0;
        for(int i=n-1;i>=0;i--){
            merasum+=arr[i];
            count++;
            if(merasum>total-merasum){
                break;

            }

        }
        System.out.println(count);
    }
}
