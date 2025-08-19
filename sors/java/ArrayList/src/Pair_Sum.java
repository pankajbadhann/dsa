import java.util.ArrayList;

public class Pair_Sum {
    public static boolean pair_sum(ArrayList<Integer>list, int target){
//        1.Brute force
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i+1; j < list.size() ; j++) {
//                if(list.get(i)+ list.get(j) == target)
//                    return true;
//            }
//        }
//        return false;

//        2.Two pointer approach
        int right_pointer = list.get(list.size())-1;
        int left_pointer = list.get(list.size())-1;
        int pair = 0;
        while(left_pointer<right_pointer){
            if(list.get(left_pointer)+ list.get(right_pointer)==target)
                return true;
            if (list.get(left_pointer)+ list.get(right_pointer)<target)
                left_pointer++;
            if(list.get(right_pointer)+ list.get(left_pointer)>target)
                right_pointer--;
        }
        return false;
    }
}
