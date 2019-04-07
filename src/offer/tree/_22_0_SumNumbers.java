package offer.tree;

/**
 * 求根到叶子节点数字之和 129 递归
 * */
public class _22_0_SumNumbers {

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    int sumNumbers(TreeNode root, int sum){
        if(root == null)
            return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null)
            return sum;
        return sumNumbers(root.left, sum) + sumNumbers(root.right,sum);
    }
}
