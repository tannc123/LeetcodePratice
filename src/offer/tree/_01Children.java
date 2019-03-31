package offer.tree;

/**
 * 计算二叉树节点个数
 * */
public class _01Children {

    /**
     * 递归计算树的节点个数
     */
    public static  int getNodeNum(TreeNode root){
        if(root == null){
            return 0;
        }
        return getNodeNum(root.left) + getNodeNum(root.right) + 1;
    }

}
