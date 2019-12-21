package CP2;
//Q：华氏温度计，给定华氏温度值，计算对应的摄氏温度值
public class test2_2 {
    public static void main(String[] args){
        int f = 200;
        int c;
        c = (int)((5.0/9)*(f-32));
        //int / 是只取整数位的，如果含有一个float就发生自动类型转换结果为float型
        System.out.println(c);
    }
}
