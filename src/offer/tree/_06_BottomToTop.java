package offer.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 自下而上分层遍历
 * */
public class _06_BottomToTop {

    public List<List<Integer>> bottomToTop(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return res;
        queue.add(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(node.right);
            }
            res.add(0, level);
        }
        return res;
    }
}
