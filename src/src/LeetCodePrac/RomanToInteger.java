package LeetCodePrac;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args){
        System.out.println("Input:");
        Scanner reader = new Scanner(System.in);
        System.out.println("Output: "+RomanToInteger.romanToInt(reader.nextLine()));

    }
    static int romanToInt(String s){
        //思路：转化为字符串数组，遍历，switch语句匹配

        char[] chars = s.toCharArray();
        int num = 0;
        int total = 0;
        for(int i = chars.length-1; i >= 0; i--){
            switch (chars[i]){
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    if(i-1>=0 && chars[i - 1] == 'I'){
                        num = 4;
                        i--;
                    }else {
                        num = 5;
                    }
                    break;
                case 'X':
                    if(i-1>=0 && chars[i-1] == 'I'){
                        num = 9;
                        i--;
                    }else {
                        num = 10;
                    }
                    break;
                case 'L':
                    if(i-1>=0 && chars[i-1] == 'X'){
                        num = 40;
                        i--;
                    }else {
                        num = 50;
                    }
                    break;
                case 'C':
                    if(i-1>=0 && chars[i-1] == 'X'){
                        num = 90;
                        i--;
                    }else {
                        num = 100;
                    }
                    break;
                case 'D':
                    if(i-1>=0 && chars[i-1] == 'C'){
                        num = 400;
                        i--;
                    }else {
                        num = 500;
                    }
                    break;
                case 'M':
                    if(i-1>=0 && chars[i-1] == 'C'){
                        num = 900;
                        i--;
                    }else {
                        num = 1000;
                    }
                    break;
            }
            total += num;
        }
        return total;
    }
}
