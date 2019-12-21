package CP2;
//Caesar密码
public class test2_18 {
    public static void main(String[] args){
        Caesar caesar = new Caesar();
        String str = "abcde";
        caesar.setString(str);
        caesar.setKey(-2);

        System.out.println(str);

        System.out.print(caesar.process());


    }
}
class Caesar {
    private String str;//待处理字符串
    private int key;//移动位数

    void setString(String str){
        this.str = str;
    }
    void setKey(int key){
        this.key = key;
    }

    //加密和解密方法
    String process(){
        String newStr = "";
        //移动
        for (int i =0; i<str.length(); i++){
            //取待处理字符串的每一个字符
            char c = str.charAt(i);

            if(c >='a' && c <= 'z'){
                c += key % 26;
                //处理移动后的越界问题
                if (c < 'a')
                    c += 26;
                if (c > 'z')
                    c -= 26;
            }else if(c >='A' && c <= 'Z'){
                c += key % 26;
                //处理移动后的越界问题
                if (c < 'A')
                    c += 26;
                if (c > 'Z')
                    c -= 26;
            }

            newStr += c;
        }
        return newStr;
    }
}
