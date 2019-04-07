package offer.array;

/**
 * 盛最多水的容器(11)
 * */
public class _04_MaxArea {
    public static void main(String[] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int arr[]){
        int max = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l < r){
            max = Math.max(max, Math.min(arr[l],arr[r]) * (r - l));
            if(arr[l] < arr[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
