package offer.tree;

/**
 * 最小深度
 * */
public class _02_2MinDepth {

    public int minDepth(TreeNode root){
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0)?1 : Math.min(left, right)+1;
    }
}
