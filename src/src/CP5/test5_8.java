package CP5;

import java.util.Stack;

/** 把一个英文字符串一空格作为分隔符，然后把分离出的单词依次入栈再出栈*/
public class test5_8 {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        String str = "Tom and Jerry";
        System.out.println("before: " + str);
        System.out.print("after: ");
        //注意foreach的局部变量类型应与所遍历的数组或集合中的元素类型一致或兼容
        for(String s : str.split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
