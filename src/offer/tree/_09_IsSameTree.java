package offer.tree;

/**\
 * 判断两颗二叉树是否结构相同
 * */
public class _09_IsSameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null |q==null)
            return false;
        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }
}
