import java.util.*;

public class DanCiChaiFen2 {
    public static List<String> wordBreak(String s, List<String> wordDict){
        Set<String> wordSet = new HashSet<String>(wordDict);
        int len = s.length();
        //1.动态回归判断是否能拆分；
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for(int i=1; i<=len; i++){
            for(int j=0; j<i; j++){
                if(wordSet.contains(s.substring(j,i)) && dp[j]){
                    dp[i] = true;
                    break;
                }
            }
        }

        //2.回溯法找到所有返回值；
        List<String> res = new ArrayList<String>();
        if(dp[len]){
            Deque<String> path = new ArrayDeque<String>();
            dfs(len, s, wordSet, dp, path, res);
        }
        return res;
    }

    private static void dfs(int len, String s, Set<String> wordSet, boolean[] dp, Deque<String> path, List<String> res) {
        if(len == 0){
            res.add(String.join(" ",path));
            return;
        }
        for(int i=len-1; i>=0; i--){
            String suffix = s.substring(i, len);
            if(wordSet.contains(suffix) && dp[i]){
                path.addFirst(suffix);
                dfs(i, s, wordSet, dp, path, res);
                path.removeFirst();
            }
        }
    }

    public static void main(String[] args) {
        String s = "wonderful";
        List<String> dict = Collections.unmodifiableList(new ArrayList<String>() {{
            this.add("wonder");this.add("ful");this.add("wonderful");
        }});
        System.out.println(wordBreak(s, dict));
    }
}
