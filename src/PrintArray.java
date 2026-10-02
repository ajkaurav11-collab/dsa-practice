import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        int temp=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println("Shorted Array:=");
        System.out.println(Arrays.toString(arr));
        System.out.println("second largest:=");
        System.out.println(arr[n-2]);



    }
}
