package CP3;

import java.util.Scanner;

//命令行的输入输出:键盘键入若干实数，求和与平均值，当输入非法字符时，结束操作。
public class test3_19 {
    public static void main(String[] args){
        System.out.println("输入若干实数，每输入一个数以回车结束");
        System.out.println("最后输入一个非数字结束输入操作");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()){
            double x = reader.nextDouble();
            sum += x;
            m ++;
        }
        System.out.println("sum =" + sum);
        System.out.println("average = "+ sum / m);
    }
}
