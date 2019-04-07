package offer.tree;

import java.util.ArrayList;
import  java.util.List;
/**
 * 路径总和II 113
 * */
public class _21_PathSum {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, new ArrayList<>(), root, sum,sum);
        return ans;
    }

    public void dfs(List<List<Integer>> ans, List<Integer> tmpList, TreeNode root,
                    int sum, int remain){
        if(root == null)
            return;
        tmpList.add(root.val);
        remain = remain - root.val;
        if(remain == 0 && root.left == null &&root.right == null){
            ans.add(tmpList);
            return;
        }
        dfs(ans, new ArrayList<>(tmpList), root.left, sum, remain);
        dfs(ans, new ArrayList<>(tmpList), root.right, sum, remain);
    }
}
