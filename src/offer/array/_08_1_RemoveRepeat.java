package offer.array;
/**
 * 删除排序数组中的重复项26
 * */
public class _08_1_RemoveRepeat {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1; j< nums.length; j++){
            if(nums[j] != nums[i])
                nums[++i] = nums[j];
        }
        return i + 1;
    }
}
