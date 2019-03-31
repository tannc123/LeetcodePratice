package offer.SortMethod;

public class QuickSort {
    public  static void main(String[] args){
        int[] intArr = {1,2,3,6,2,7,8,2};
        quickSort(intArr, 0, intArr.length-1);
        for(int t : intArr)
            System.out.println(t);
    }


    public static void quickSort(int[] intArr, int low, int high){
        if(low > high)
            return ;
        //存
        int i = low;
        int j = high;
        //key
        int key = intArr[low];
        //完成一趟排序
        while(i < j){
            while (i<j && intArr[j] > key){
                j--;
            }
            while (i<j && intArr[i] <= key){
                i++;
            }
            if(i < j){
                int p = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = p;
            }
        }
        //调整key的位置
        int temp = intArr[i];
        intArr[i] = intArr[low];
        intArr[low] = temp;
        quickSort(intArr, low, i-1);
        quickSort(intArr, i+1, high);
    }
}
