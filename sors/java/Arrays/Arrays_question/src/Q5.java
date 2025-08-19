import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Q5 {
    public static ArrayList<ArrayList<Integer>> triplets(int[] nums){
        if (nums.length == 0 || nums.length<=2)
            return new ArrayList<>();
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        ArrayList<Integer> curr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i+1; j < nums.length ; j++) {
                int b = nums[j];
                for (int k = j+1; k < nums.length ; k++) {
                    int c = nums[k];

                    if (nums[i]+nums[j]+nums[k] == 0 ) {
                        curr.add(nums[i]);
                        curr.add(nums[j]);
                        curr.add(nums[k]);
                        Collections.sort(curr);
                        ans.add(curr);
                        curr = new ArrayList<>();
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.addAll(ans);


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0,  1, 2, -1, -4};
        System.out.println(triplets(nums));
    }
}
