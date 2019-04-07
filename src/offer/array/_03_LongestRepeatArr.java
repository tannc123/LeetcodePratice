package offer.array;

/**
 * 最长重复子数组
 * */
public class _03_LongestRepeatArr {
    public static void main(String[] args){
        int[] arrA = {1,2,3,2,1};
        int[] arrB = {3,2,1,4,7};
        System.out.println(findLength(arrA, arrB));
    }

    public static int findLength(int[] arrA, int[] arrB){
        int max = 0;
        int[][] dp = new int[arrA.length][arrB.length];
        for(int i = 0; i < arrA.length; i++ ){
            for(int j = 0; j < arrB.length ; j++){
                if(i == 0  || j == 0)
                    dp[i][j] = arrA[i] == arrB[j]?1 : 0;
                else if(arrA[i] == arrB[j]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
