import java.util.ArrayList;
import java.util.List;

public class ZhongXuBianLi {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        mid(root, res);
        return res;
    }

    private void mid(TreeNode root, List<Integer> res) {
        if (root == null)return;
        mid(root.left, res);
        res.add(root.val);
        mid(root.right, res);
    }
}
