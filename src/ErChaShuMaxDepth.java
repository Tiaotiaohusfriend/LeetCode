public class ErChaShuMaxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        int llen = maxDepth(root.left);
        int rlen = maxDepth(root.right);
        return Math.max(llen, rlen) + 1;
    }
}
