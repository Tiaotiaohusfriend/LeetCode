public class q01beibao {
    public static void main(String[] args) {
        int[] w = {1,2,3};
        int[] v = {6,10,12};
        int sum = 5;
        System.out.print(solution(w, v, sum));
    }
    public static int solution(int[] w, int[] v, int sum){
        int[][] dp = new int[w.length+1][sum+1];
        for(int i=1; i<=w.length; i++){
            for(int j=1; j<=sum; j++){
                if(j < w[i-1]) dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i-1]] + v[i-1]);
                }
            }
        }
        return dp[w.length][sum];
    }
}
