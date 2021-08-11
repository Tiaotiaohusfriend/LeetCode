import java.util.HashMap;
import java.util.Map;

public class ZiMuYiWeiCi {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
        for(char key : map.keySet()){
            if(map.get(key) != 0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        System.out.println(isAnagram(s,t));
    }
}
