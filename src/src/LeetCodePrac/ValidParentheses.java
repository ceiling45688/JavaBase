package LeetCodePrac;
/**R: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.*/
public class ValidParentheses {
    //方法一（学习）:字符串替换，新学习了String 的两个方法 contains(c); replaceAll();
    // 注意replaceAll方法实际上是用正则表达式匹配的，在regex中"\\"表示一个"\"，在java中一个"\"也要用"\\"表示。
    // 这样，前一个"\\"代表regex中的"\"，后一个"\\"代表java中的"\"。所以要想使用replaceAll方法将字符串中的反斜杠("\")替换成空字符串("")，则需要这样写：str.replaceAll("\\\\","");
    //Java API so cool!

    public static boolean isValid(String s){
        if (s == null || "".equals(s)) {return true;}

        while (s.contains("()") ||s.contains("[]") || s.contains("{}")){
            if (s.contains("()")){
                s = s.replaceAll("\\(\\)","");
            }
            if (s.contains("[]")){
                s =s.replaceAll("\\[\\]","");
            }
            if (s.contains("{}")){
                s = s.replaceAll("\\{\\}","");
            }
        }
        return "".equals(s) ? true : false;

    }

    public static void main(String[] args){
        System.out.println(ValidParentheses.isValid("([]}"));
    }
}


//现在不能处理"(()("