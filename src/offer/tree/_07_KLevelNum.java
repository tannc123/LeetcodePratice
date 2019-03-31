package offer.tree;

/**
 * 求第层节点个数
 * */
public class _07_KLevelNum {

    int getKLevelNum(TreeNode root, int k){
        if(root == null || k <=0)
            return 0;
        if(root!= null && k==1)
            return 1;
        return getKLevelNum(root.left, k -1)+getKLevelNum(root.right, k-1);
    }
}
