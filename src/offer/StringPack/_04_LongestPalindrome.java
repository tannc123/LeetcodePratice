package offer.StringPack;

/**
 * 最长回文字符串构造
 * */
public class _04_LongestPalindrome {

    public int longestPalindrome(String s){
        int[] flag = new int[56];
        int length = 0;
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 65;
            flag[index] = ~flag[index];
            if(flag[i] == 0)
                length += 2;
        }
        return length < s.length()? length + 1 : length;
    }
}
