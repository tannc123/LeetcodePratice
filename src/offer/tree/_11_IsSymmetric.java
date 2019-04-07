package offer.tree;

/**
 * 判断是否是对称二叉树
 * */
public class _11_IsSymmetric {

    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val != right.val)
            return false;
        return  isSymmetricHelper(left.left, right.right)
                && isSymmetricHelper(left.right, right.left);
    }
}
