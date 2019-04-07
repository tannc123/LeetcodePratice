package offer.tree;

/**
 * 求二叉树的长度或者直径(疑问)
 * */
public class _13_LengthOfTree {
    private  int path;

    public int lengthHelper(TreeNode root){
        if(root == null)
            return 0;
        int left = lengthHelper(root.left);
        int right = lengthHelper(root.right);
        path = Math.max(path, left + right);
        return  Math.max(left,right) + 1;
    }
}
