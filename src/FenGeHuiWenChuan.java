import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FenGeHuiWenChuan {
    public static List<List<String>> pertition(String s){
        List<List<String>> res = new ArrayList<List<String>>();
        int len = s.length();
        if(len == 0) {
            return res;
        }
        Deque<String> output = new ArrayDeque<>();
        char[] charS = s.toCharArray();
        dfs(0, len, charS, output ,res);
        return res;
    }

    private static void dfs(int index, int len, char[] charS, Deque<String> output, List<List<String>> res) {
        if(index == len){
            res.add(new ArrayList<String>(output));
            return;
        }
        for(int i=index; i<len;i++){
            if(!isPalindrome(charS, index, i)) continue;
            output.addLast(new String(charS, index, i+1-index));
            dfs(i+1,len, charS, output, res);
            output.removeLast();
        }
    }

    private static boolean isPalindrome(char[] charS, int left, int right) {
        while (left < right){
            if(charS[left] != charS[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "sassas";
        System.out.println(pertition(s));
    }
}
