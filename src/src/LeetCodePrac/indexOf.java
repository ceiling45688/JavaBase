package LeetCodePrac;

public class indexOf {
    static int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;}
        if (haystack.length() < needle.length()){
            return -1;}

        for (int i = 0; i < haystack.length() - (needle.length() -1); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    break;}
                if (j + 1 == needle.length()){
                    return i;}
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(strStr("hhhlllooo", "lo"));
    }
}
