package offer.array;

/**
 * 移除元素27
 * */
public class _08_0_removeElement {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] != val)
                nums[j++] = nums[i];
        }
        return j;
    }
}
