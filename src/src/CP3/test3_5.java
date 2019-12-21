package CP3;
//对传进来的两个整数按从小到大排列
public class test3_5 {
    public static void sort(int a, int b){
        int temp;
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("a = "+ a + ", b = " + b);
    }


    public static void main(String[] args){
        int x = 5, y = 3;
        System.out.println("x = "+ x+", y = "+ y);
        test3_5.sort(x, y);
        System.out.println("x = "+ x+", y = "+ y);

    }
}
