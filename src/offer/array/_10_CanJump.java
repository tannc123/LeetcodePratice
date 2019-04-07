package offer.array;

/**
 * 跳跃游戏55
 * */
public class _10_CanJump {
    public boolean canJump(int[] nums){
        for(int i=nums.length-2,j=nums.length-1; i >=0;i--){
            if(nums[i] >= j-i){
                j = i;
            }else{
                if(i == 0)
                    return false;
            }
        }
        return true;
    }
}
