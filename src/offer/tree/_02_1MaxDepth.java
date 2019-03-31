package offer.tree;

/**
 * 求树的最大层数(深度)
 * */
public class _02_1MaxDepth {
    public  int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
