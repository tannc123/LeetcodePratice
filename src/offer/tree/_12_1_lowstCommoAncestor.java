package offer.tree;

/**
 * 二叉搜索树的最低公共祖先
 * */
public class _12_1_lowstCommoAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root.val > p.val && root.val > q.val)
            return  lowestCommonAncestor(root.left, p, q);
        else if(root.val < p.val && root.val< p.val)
            return lowestCommonAncestor(root.right, p, q);
        else
             return root;
    }
}
