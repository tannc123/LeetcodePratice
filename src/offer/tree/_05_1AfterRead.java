package offer.tree;

import java.util.ArrayList;
/**
 * 后续遍历
 * */
public class _05_1AfterRead {
    public void afterRead(TreeNode root, ArrayList<Integer> res){
        if(root == null)
            return ;
        afterRead(root.left, res);
        afterRead(root.right, res);
        res.add(root.val);
    }
}
