package LeetCodePrac;

import java.util.Scanner;

//判断一个整数是否是回文
public class HuiWen {
    public static void main(String[] args){
        System.out.println("input number:");
        Scanner reader = new Scanner(System.in);
      System.out.println(Judge.funciotn(reader.nextInt()));
//        System.out.println(Judge2.IsPalindrome(reader.nextInt()));
//        System.out.println(Judge.IsPalindrome(reader.nextInt()));
    }
}
class Judge{
    //先判断是否为负数，然后转为字符串，再转为数组判断
    public static boolean funciotn(int num){
        if (num < 0){
            return false;
        }else {
            String x = Integer.toString(num);
            char[] chars = x.toCharArray();

            for(int i=0; i <= (chars.length/2); i++){
                if ((int)chars[i] != (int)chars[chars.length-1-i]) {
                    return false;
                }
            }
        }
        return true;
    }
//    修改方法,这个更好，时间复杂度为线性
//    注意，易错的是while的if判断中很容易有范围问题哈，长度为2位的回文会有问题

    public static boolean IsPalindrome(int x){
        //必须这样哈！
        if (x  < 0) {
            return false;
        }
        if (x < 10){
            return  true;
        }


        String xx = Integer.toString(x);
        int left = 0;
        int right = xx.length() - 1;
        while(left > -1 && right < xx.length()
                && xx.charAt(left) == xx.charAt(right)){
//            char a = xx.charAt(left);
//            char b = xx.charAt(right);

            left++;
            right--;
            //此处易错哈！
//            double c = xx.length() / 2.0;

            if(left >= xx.length() / 2.0){
                return true;
            }
        }
        return false;
    }
}
//不用字符串的方法---解法来自LeetCode官方
class Judge2 {
    public static boolean IsPalindrome(int x){
        if (x < 0 || (x % 10 ==0 && x != 0)){
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber){
            revertedNumber = revertedNumber*10  + x % 10;
            x = x / 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
//思路：采用整数比较的时候不能直接全部反转来比较，这样很容易溢出，有几个方式来解决
//1：因为int正数最大值2147483647，显然最大的回文是不会溢出的，溢出了就不是回文了，可以通过try catch来捕获异常，但这样感觉不太好。。
//2.按上面的方法，只反转一半就不会产生溢出的问题。