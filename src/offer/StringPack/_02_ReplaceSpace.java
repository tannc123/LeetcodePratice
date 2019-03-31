package offer.StringPack;

public class _02_ReplaceSpace {
    public static void main(String[] args){
        System.out.println(replaceSpace("We Are Happy"));
    }

    public static String replaceSpace(String str){
        StringBuilder sBuilder = new StringBuilder(str);
        StringBuilder rBuilder = new StringBuilder();
        int len = sBuilder.length();
        for(int i=0;i<len;i++){
            if(sBuilder.charAt(i) == ' '){
                rBuilder.append("%20");
            }else{
                rBuilder.append(str.charAt(i));
            }
        }
        return rBuilder.toString();
    }
}
