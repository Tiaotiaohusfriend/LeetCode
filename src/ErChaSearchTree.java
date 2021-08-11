public class ErChaSearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root , long low, long high){
        if(root == null);
        if(root.val > high || root.val < low)return false;
        return isValidBST(root.left, low, root.val)&&isValidBST(root.right,root.val,high);
    }
}
