package CP2;
//判断字符串是否为回文
public class test2_27 {
    public static void main(String[] args){
        HuiWen hw = new HuiWen();
        hw.setStr("abccba");
        if (hw.JudgeHuiWen() == true){
            System.out.println("hw 是回文字符串");
        }else {
            System.out.println("hw 不是回文字符串");
        }
    }
}
class HuiWen{
    private String str;
    void setStr(String str){
        this.str = str;
    }

    boolean JudgeHuiWen(){
        int i = 0, j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
