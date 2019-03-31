package offer.tree;

import java.util.ArrayList;

/**
 * 二叉树的前序遍历(递归算法)
 * */
public class _03_1PreOrderRead {

    public  ArrayList<Integer> preOrderRead(TreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        preOrder(root, result);
        return result;
    }

    void preOrder(TreeNode root,ArrayList<Integer> result){
        if(root == null)
            return ;
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }
}
