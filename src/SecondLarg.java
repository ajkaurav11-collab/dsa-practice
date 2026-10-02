import java.util.Arrays;
import java.util.Scanner;

public class SecondLarg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=0;
        int slargest=0;
        int temp=0;


        int []arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5-1;i++){
            for(int j=0;j<5-1;i++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<5-1;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if( arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("largest:="+largest);
        System.out.println("slargest:="+slargest);
    }
}
