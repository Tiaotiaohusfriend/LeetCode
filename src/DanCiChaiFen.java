import java.util.*;

public class DanCiChaiFen {
    public static boolean wordBreak(String s, List<String> wordDict){
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        Set<String> wordDictSet= new HashSet<>(wordDict);
        dp[0] = true;
        for(int i=1; i<=len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }

    public static void main(String[] args) {
        String s = "wonderful";
        List<String> dict = Collections.unmodifiableList(new ArrayList<String>() {{
            this.add("wonder");
        }});
        System.out.println(wordBreak(s, dict));
    }
}
