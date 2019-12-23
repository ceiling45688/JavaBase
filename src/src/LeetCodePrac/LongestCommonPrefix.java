package LeetCodePrac;
/**Requirement:Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".*/
public class LongestCommonPrefix {
   /* public static String longestCommonPrefix(String[] strs) {


        int length = strs[0].length();
//        System.out.println(length);
        if(length == 0){return "";}
        if(strs.length == 1) {return strs[0];}

        for(int i =0; i < length; i ++){
            for (int j =0; j< length; j++){
//                char a = strs[0].charAt(j);
//                char b = strs[i+1].charAt(j+1);
//哭了，数组下标越界咋处理啊！
                try{
                if ( strs[0].charAt(j) != strs[i+1].charAt(j)){
                    return strs[0].substring(0,j);
                }}catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(strs[0].substring(0,j));
                }
            }
        }
        return strs[0];
    }*/
//学习了官方的解法1：
    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0) {return "";}
        String prefix = strs[0];
        for (int i = 1; i<strs.length; i++){
//          在其他串中没有子串，或者子串的第一个下标不是0，则子串缩短一位
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()) {return "";}
            }
        }
        return prefix;
    }




    public static void main(String[] args){
        String[] strs = {"hilll","hi","hil"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs));
    }
}
/** 思路1：二维数组的两重循环*/
