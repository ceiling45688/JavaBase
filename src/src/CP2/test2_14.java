package CP2;
//计算Fibonacci数列前二十项
public class test2_14 {
    public static void main (String []  args){
        int fib[] = new int[20];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < 20; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 0; i<fib.length ;i++){
            System.out.println(fib[i]);
        }

    }
}
