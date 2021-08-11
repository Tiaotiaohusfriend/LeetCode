public class YanZhengHuiWenString {
    public static boolean isPalindrome(String s) {
        int len = s.length();
        s = s.toLowerCase();
        char[] chars = new char[len];
        int j = 0;
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                chars[j++] = ch;
            }
        }
        int i = 0;
        j=j-1;
        while(i < j){
            if(chars[i] != chars[j])return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
