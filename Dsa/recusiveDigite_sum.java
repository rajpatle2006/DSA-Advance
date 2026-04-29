import java.util.Arrays;

public class recusiveDigite_sum{
    static int sum (int n, int[ ]dp) {
        if (n==0) return 0;
        if (dp[n] != -1) return dp[n];
        dp[n] =(n%10) + sum(n/10,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 1234;
        int[] dp =new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(sum(n,dp));
    }
}