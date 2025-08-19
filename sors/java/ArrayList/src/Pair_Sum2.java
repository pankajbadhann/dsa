import java.util.ArrayList;

public class Pair_Sum2 {
    public static boolean pair_sum2(ArrayList<Integer>list, int target){
//        Pivot
        int pivot = -1;
        int lp, rp;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>list.get(i+1)){
                pivot = i;
            }
        }
        lp = pivot;
        rp = pivot+1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target)
                return true;
            if (list.get(lp)+list.get(rp)<target)
                lp = (lp+1)% list.size();
            else
                rp = (list.size()+rp-1)%list.size();
        }
        return false;
    }
}
