public class Longest_common_sub_string {
    public static int longest_common_sub_string(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int [][]dp = new int[n+1][m+1];
        int ans = 0;

        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
               if(s1.charAt(i-1) == s2.charAt(j-1)){
                   dp[i][j] = dp[i-1][j-1]+1;
                   ans = Math.max(ans, dp[i][j]);
               }else
                   dp[i][j] = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcdgh";
        String s2 = "abedfhr";
        System.out.println(longest_common_sub_string(s1, s2));
    }
}
