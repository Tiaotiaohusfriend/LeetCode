public class DuiChenErChaShu {
    public static boolean isDuiChen(TreeNode root){
        return isDuiChen(root, root);
    }

    private static boolean isDuiChen(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return p.val== q.val && isDuiChen(p.left, q.right) && isDuiChen(p.right, q.left);
    }
}
