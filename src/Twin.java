import java.util.Scanner;
public class Twin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        n=arr.length;
        int mid=n/2;
        int leftsum=0,leftcount=0;
        int rightsum=0,rightcount=0;

        for(int i=0;i<mid;i++){

                leftsum += arr[i];
                leftcount++;



        }


        for(int i=n-1;i>=mid;i--){
            rightsum+=arr[i];
            rightcount++;


        }

        if(leftsum>rightsum ){
            System.out.println(leftcount);

        }else if(leftsum==rightsum && leftcount==rightcount){
            System.out.println(rightcount+1);
        }else{
            System.out.println(rightcount);
        }

    }
}
