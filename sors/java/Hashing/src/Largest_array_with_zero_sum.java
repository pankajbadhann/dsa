import java.util.HashMap;

public class Largest_array_with_zero_sum {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {10,2,-2,-20,10};
        int k = -10;
        System.out.println(subarraySum(a,k));
    }
}
