package offer.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树非递归层次遍历
 * */
public class _03_2PreOrderRead {

    public List<Integer> preOrderRead(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)
            return  result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(root.val);
            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return result;
    }
}
