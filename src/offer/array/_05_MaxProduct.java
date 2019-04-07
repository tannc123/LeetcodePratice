package offer.array;

/**
 * 乘积最大子序列（152）
 * */
public class _05_MaxProduct {
    public static void main(String[] args){
        int[] test01 = {2,3,-2,4};
        int[] test02 = {-2,0,-1};
        System.out.println(maxResult(test01));
        System.out.println(maxResult(test02));
    }

    public static int maxResult(int[] arr){
        int ans = Integer.MIN_VALUE, l = 0, r = 0;
        for(int i=0,size = arr.length-1; i<arr.length; i++){
            int lNum = arr[i],rNum = arr[size-i];
            l = l ==0?lNum: lNum*l;
            r = r ==0?rNum: rNum*r;
            ans = Math.max(ans, Math.max(l, r));
        }
        return ans;
    }
}
