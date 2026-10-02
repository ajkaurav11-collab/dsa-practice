import java.util.Scanner;

public class Vasya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
      for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            sum=sum+(x+y+z);


        }
        if(sum==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
