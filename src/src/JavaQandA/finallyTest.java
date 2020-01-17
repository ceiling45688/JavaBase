package JavaQandA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 关于异常处理中finally 语句的一些处理疑惑
 */
public class finallyTest {
    /**
     * try 语句中已经有返回值了还会执行finally吗？
     * --会
     *
     * 执行顺序:  finally 语句块是在 try 或者 catch 中的 return 语句之前执行的。
     * 更加一般的说法是，finally 语句块应该是在控制转移语句之前执行，
     * 控制转移语句除了 return 外，还有 break 和 continue。
     * 另外，throw 语句也属于控制转移语句。
     *
     * ps:其中 return 和 throw 把程序控制权转交给它们的调用者（invoker），
     * 而 break 和 continue 的控制权是在当前方法内转移。
     */
    public static void main(String[] args){
        finallyTest test = new finallyTest();
        System.out.println(test.amethod2());
    }

    public int amethod(){
        try{
            FileInputStream dis = new FileInputStream("没有这个文件.txt");
        }catch (FileNotFoundException e){
            System.out.println("No such file found!");
            return -1;
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("Doing finally!");
        }

        return 0;
    }

    /**
     * 特例：
     *  当在try 语句块中执行了System.exit(0);会终止Java虚拟机的运行，自然不会执行finally语句了
     */
    public  int amethod2() {
        int i = 1;
        try {
            System.out
                    .println("try block");
            System.exit(0);
            return i;
        }finally {
            System.out
                    .println("finally block");
        }
    }

}
