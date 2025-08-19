import java.util.Arrays;
import java.util.HashSet;

public class Longest_increasing_subsequence {
    public static int longest_increasing_subsequence(int []arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] arr2 = new int[set.size()];
        int index = 0;
        for (int i:set) {
            arr2[index] = i;
            index++;
        }
        Arrays.sort(arr2);
        return lcs(arr, arr2);
    }
    public static int lcs(int[] arr, int[] arr2){
        int n = arr.length;
        int m = arr2.length;
        int[][]dp = new int[arr.length+1][arr2.length+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <m+1 ; j++) {
                if(arr[i-1] == arr2[j-1])
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println(longest_increasing_subsequence(arr));
    }
}
