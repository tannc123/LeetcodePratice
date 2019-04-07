package offer.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 求根到叶子节点数字之和 129非递归
 * */
public class _22_1_SumNumbers {
    public int sumNumbers(TreeNode root) {
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()){
            root = queue.remove();
            if(root.left == null && root.right == null)
                result += root.val;
            if(root.left != null){
                root.left.val += root.val * 10;
                queue.add(root.left);
            }
            if(root.right != null){
                root.right.val += root.val * 10;
                queue.add(root.right);
            }
        }
        return result;
    }
}
