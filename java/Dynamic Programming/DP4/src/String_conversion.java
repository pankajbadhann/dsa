public class String_conversion {
    public static void string_conversion(String s1, String s2) {

        int ans = lcs(s1, s2);

        int add_operation = s2.length() - ans;
        int delete_operation = s1.length() - ans;
        int total_operation = add_operation+delete_operation;
        System.out.println("Add operation: " + add_operation);
        System.out.println("Delete operation: " + delete_operation);
        System.out.println("Total operation: "+ total_operation);
    }

    public static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "aceg";
        string_conversion(s1, s2);
    }
}
