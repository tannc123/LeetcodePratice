package offer.tree;

import java.util.*;

/**
 * 非递归后序遍历二叉树
 * */
public class _05_2AfterRead {
    public List<Integer> afterReadTree(TreeNode root){
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> statck = new ArrayDeque<>();
        TreeNode p = root;
        statck.push(p);
        while (!statck.isEmpty()) {
            if (p != null){
                statck.push(p);
                result.addFirst(p.val);
                p = p.right;
            }else{
                TreeNode node = statck.pop();
                p = node.left;
            }
        }
        return result;
    }
}
