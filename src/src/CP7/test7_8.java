package CP7;

import java.io.*;

/**
 * 1.A BufferedInputStream为另一个输入流添加了功能，即缓冲输入和支持mark和reset方法的功能。
 * 当创建BufferedInputStream时，将创建一个内部缓冲区数组。 当从流中读取或跳过字节时，
 * 内部缓冲区将根据需要从所包含的输入流中重新填充，一次有多个字节。
 * mark操作会记住输入流中的一点，并且reset操作会导致从最近的mark操作之后读取的所有字节在从包含的输入流中取出新的字节之前重新读取。
 *
 *
 * */
public class test7_8 {
    public static void main(String[] args){
        try {
            byte[] data = new byte[1];
            File srcFile = new File(args[0]);//sourse
            File desFile = new File(args[1]);//destination
            BufferedInputStream input = new BufferedInputStream(
                    new FileInputStream(srcFile));
            BufferedOutputStream output = new BufferedOutputStream(
                    new FileOutputStream(desFile));
            System.out.println("state repeating:" +  srcFile.length() + " bytes");
            while(input.read(data) != -1) {
                output.write(data);
            }
            output.flush();
            input.close();
            output.close();
            System.out.println("complete!");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("please input args :src and des");
            e.printStackTrace();
        }
    }
}
