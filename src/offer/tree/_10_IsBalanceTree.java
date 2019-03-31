package offer.tree;

/**
 * 判断是否是平衡二叉树
 * */
public class _10_IsBalanceTree {
    /**
     * 判断是否是平衡二叉树
     * */
    public boolean isBalanceTree(TreeNode root){
        if(null == root)
            return true;
        return Math.abs(maxHigh(root.left) - maxHigh(root.right)) <= 1 &&
                isBalanceTree(root.left) && isBalanceTree(root.right);
    }

    /**
     * 获取二叉树最大深度
     * */
    public int maxHigh(TreeNode root){
        if(null == root)
            return 0;
        return Math.max(maxHigh(root.left), maxHigh(root.right));
    }
}
