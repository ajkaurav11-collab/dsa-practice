import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the array to find the second largest: ");
        int arr[]={n};

        int largest=arr[0];
        int slargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        System.out.println("the second largest number in the array is "+slargest);
    }
}
