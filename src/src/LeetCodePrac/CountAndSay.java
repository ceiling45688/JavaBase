package LeetCodePrac;

/**
 * 这道递归的题目没有看懂...不知道怎么用代码翻译出来。然后看了别人的解法如下
 */
public class CountAndSay {
    static String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    builder.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            builder.append(count).append(pre);
            str = builder.toString();
        }

        return str;
    }

    public static void main(String[] args){
        System.out.println(countAndSay(5));
    }
}
