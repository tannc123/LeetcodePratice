package offer.tree;

import java.util.ArrayList;

/**
 * 二叉树中序遍历(递归)
 * */
public class _04_1MidOrderRead {

    public static void midOrderRead(TreeNode root, ArrayList<Integer> res){
        if(root == null){
            return;
        }
        midOrderRead(root, res);
        res.add(root.val);
        midOrderRead(root, res);
    }

}
