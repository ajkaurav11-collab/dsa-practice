import java.util.*;

public class ArrayLis {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
//       list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(888);
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(888);list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(888);
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(888);
        for(int i=0;i<4;i++){
            list.add(new ArrayList<>());

        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
