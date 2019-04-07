package offer.array;

/**
 *  53. 最大子序和
 * */
public class _02_MaxSubArray {

    public static void main(String[] args){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSub(arr));
    }

    public static int maxSub(int[] arr){
        int res = arr[0]; //防止全部为负数
        int sum = 0;
        for(int num : arr){
            if(sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
