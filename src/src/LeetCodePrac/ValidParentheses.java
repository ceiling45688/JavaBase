package LeetCodePrac;
/**R: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.*/
public class ValidParentheses {
    public static boolean isValid(String s){
        String strOpen = "({[";
        String strClose = ")}]";
        if (s.isEmpty()){return true;}
        if (s.charAt(0) == ')' || s.charAt(0) == '}'||s.charAt(0) == ']') {return false;}
        //找到第一个字符在stropen中的下标
        int firstCharPos = strOpen.indexOf(s.charAt(0));
        //strclose对应的firstchar，在s中搜索，若无，说明是有一个括号是没有闭合的。
        char firstCharInstrClose = strClose.charAt(firstCharPos);
        if(s.indexOf(firstCharInstrClose,1) == -1){return false;}

        //同理还有 []) 最后一位是没闭合的特殊情况
        int lastCharPos = strClose.lastIndexOf(s.charAt(s.length()-1));
        char lastCharInstrOpen = strOpen.charAt(lastCharPos);
        if(s.indexOf(lastCharInstrOpen) == -1) {return false;}

        //现在确定所有括号都是闭合的，接下来需要确定括号的顺序。
        //从S的最后一位开始往前遍历直到第一位，每一位都判断它和它前一位是否闭合，或者同属strclose，是的话就继续往前搜索。
        out: for(int i = s.length()-1; i>=1; i--){
            int currentCharPos = strClose.indexOf(s.charAt(i));

                //确定前一位是否同属一个close组 like )), }}, ]]
                if (strClose.indexOf(s.charAt(i - 1)) == -1) {
                    //确定与前一位是否闭合 like() {} []
                    if (s.charAt(i-1) == strOpen.charAt(currentCharPos)) {
                        i--;
                        continue out;
                    }
                    return false;
                }

            }
        return true;
    }

    public static void main(String[] args){
        System.out.println(ValidParentheses.isValid("([])"));
    }
}


//现在不能处理"(()("