package offer.array;

/**
 * 连续的子数组和  523
 * https://blog.csdn.net/qq_25481047/article/details/86587069
 * */
public class _13_CheckSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int length = nums.length;
        if(length < 2)
            return false;
        for(int i=0; i<length; i++){
            int sum = nums[i];
            for(int j=i+1; j<length; j++){
                sum += nums[j];
                if(k == 0 && sum == k)
                    return true;
                if(k!=0 && sum%k == 0)
                    return true;
            }
        }
        return false;
    }
}
