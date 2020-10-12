package cn.ascending.LeetCode;

//70
public class ClimbStairs {
    public static int ClimbWays(int n){
        int[] dp=new int[n+1];
        //number of ways to climb 0 step
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }
}
