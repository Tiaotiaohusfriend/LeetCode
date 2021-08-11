import java.util.*;

public class ErChaShuCengXuBianLi {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)return res;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode s = queue.poll();
                list.add(s.val);
                if(s.left != null)queue.add(s.left);
                if(s.right != null)queue.add(s.right);
            }
            res.add(list);
        }
        return res;
    }
}
