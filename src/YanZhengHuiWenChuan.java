public class YanZhengHuiWenChuan {
    public static boolean isPalindrome(String s){
        StringBuffer sgood = new StringBuffer();
        int l = s.length();
        for(int i=0; i<l; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sgood.append(Character.toLowerCase(ch));
            }
        }
        int l2 = sgood.length();
        int i = 0,j = l2-1;
        while(i < j){
            if(sgood.charAt(i) != sgood.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "\"A man, a plan, a canal: Panama\"";
        System.out.println(isPalindrome(s));
    }
}
