package offer.tree;

/**
 * 求二叉树的最低公共祖先
 * */
public class _12_0_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null)
            return root;
        return left == null ? right : left;
    }
}
