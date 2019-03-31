package offer.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 从上而下层次打印
 * */
public class _06_TopToBottom {
    public List<List<Integer>> topToBottom(TreeNode root){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur = null;

        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            int cnt = queue.size();
            for(int i=0; i<cnt; i++){
                cur = queue.poll();
                level.add(cur.val);
                if(cur.left != null)
                    queue.add(root.left);
                if(cur.right != null)
                    queue.add(root.right);
            }
            res.add(level);
        }
        return res;
    }
}
