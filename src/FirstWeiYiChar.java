import java.util.HashMap;
import java.util.Map;

public class FirstWeiYiChar {
    public static int firstChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.get(c) == 1)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "adasdsadsv";
        System.out.println(firstChar(s));
    }
}
