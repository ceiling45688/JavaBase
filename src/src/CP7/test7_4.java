package CP7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流泪Outputstream类：
 * 方法：
         * void close()
         * 关闭此输出流并释放与此流相关联的任何系统资源。
         * void flush()
         * 刷新此输出流并强制任何缓冲的输出字节被写出。
         * void write(byte[] b)
         * 将 b.length字节从指定的字节数组写入此输出流。
         * void write(byte[] b, int off, int len)
         * 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
         * abstract void write(int b)
         * 将指定的字节写入此输出流。
 * tips：write()方法没有返回值，要想知道写操作是否成功只能通过捕获write方法所抛出的异常才能决定，如果没有捕获到异常则可认为写成功。
 *
 * */
public class test7_4 {
    public static void main(String[] args){
        try{
            FileInputStream in = new FileInputStream("src/src/CP7/MyDir/test.txt");
            FileOutputStream out = new FileOutputStream("src/src/CP7/MyDir/out.txt");
            byte[] byteArray = new byte[1024];//存储数据用字节数组
            do {
                int len = in.read(byteArray,0,1024);//返回读出的字节长度
                out.write(byteArray,0,len);
            }while (in.available() > 0);
            in.close();
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
