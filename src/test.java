import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String str = "[[1,2,3],[3,4,5]]";
        str = str.replace("[", "").replace("]", "");
        String[] strs = str.split(",");
        int[] nums = new int[strs.length];
        int idx = 0;
        for(String s : strs){
            nums[idx++] = Integer.parseInt(s);
        }

        System.out.println(nums);
    }
}
