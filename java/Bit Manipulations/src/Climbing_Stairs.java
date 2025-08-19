import java.util.Arrays;

public class Climbing_Stairs {
    public static int climbing_Stairs(int n){
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        return climbing_Stairs(n-1)+climbing_Stairs(n-2);
    }
    public static int climbing_stairs_dp(int n, int []dp){
        if (n<0)
            return 0;
        if(n == 0)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        dp[n] = climbing_stairs_dp(n-1, dp) + climbing_stairs_dp(n-2, dp) + climbing_stairs_dp(n-3, dp);
        return dp[n];
    }
    public static int climbing_stairs_tabulation(int dp[], int n){
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 3; i <n ; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbing_Stairs(3));
        int []dp = new int[3+1];
        Arrays.fill(dp, -1);
        System.out.println(climbing_stairs_dp(3, dp));
        System.out.println(climbing_stairs_tabulation(dp, 3));
    }
}
