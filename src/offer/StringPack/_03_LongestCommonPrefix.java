package offer.StringPack;

import java.util.Arrays;

/**
 * 最长公共前缀
 * 先排序，然后从头开始对比
 * */
public class _03_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length==0)
            return "";
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        StringBuffer res = new StringBuffer();
        for(int i=0;i<last.length;i++){
            if(first[i] == last[i])
                res.append(first[i]);
            else
                break;
        }
        return res.toString();
    }
}
