package LeetCodePrac;

public class IntagerReverse {
    public static void main (String[] args){
        Solution2 solution = new Solution2();
        int num = 123456;
        System.out.println("number = "+ num);
        System.out.println("reverse number = "+ solution.reverse(num));
    }
}
class Solution {
    public int reverse(int x) {
        int term;
        long b = 0;//反转后的数
        while (x != 0){
            term = x % 10;//按位取出
            x = x / 10;
            b = b * 10 + term;
        }
        //溢出处理
        if (b > Integer.MAX_VALUE || b < Integer.MIN_VALUE){
            return 0;
        }
        return (int) b;
    }
}
class Solution2 {
    //思路：先转为字符串，再转为char[]数组，然后倒序遍历。
    public int reverse(int x){
        String a = Integer.toString(x);
        int b = 1;//假定为正数

        if (a.charAt(0) == '-'){
            a = a.substring(1);//截取后面
            b = -1;//负号
        }

        char[] chars = a.toCharArray();
        char[] charsNew = new char[chars.length];
        //倒序遍历
        for (int i = chars.length-1; i>=0; i--){
            charsNew[chars.length - 1 - i] = chars[i];
        }
        //转回长整型
        Long aLong = Long.valueOf(new String(charsNew));
        //判断溢出
        if (aLong < Integer.MIN_VALUE || aLong > Integer.MAX_VALUE){
            return 0;
        }
        return (int)(aLong*b);
    }
}