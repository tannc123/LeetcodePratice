package offer.array;

/**
 * 最佳观光组合
 * https://leetcode-cn.com/problems/best-sightseeing-pair/
 * */
public class _01_MaxCoreSightseeingPair {

    public static void main(String[] args){
        int[] arr ={8,1,5,2,6};
        System.out.println(maxCoreSeeing(arr));
    }

    public static int maxCoreSeeing(int[] arr){
        int maxLeft = 0;
        int maxCore = 0;
        for(int i=0;i<arr.length;i++){
            maxCore = Math.max(maxCore, maxLeft + arr[i] -i);
            maxLeft = Math.max(maxLeft, i + arr[i]);
        }
        return maxCore;
    }
}
