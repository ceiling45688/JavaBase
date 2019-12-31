package CP7;

import java.io.File;

public class test7_2 {
    static void list(File file){
        if (file != null){
            if (file.isDirectory()){
                File f[] = file.listFiles();//如果是目录，列出全部内容
                if (f != null){
                    for (int i = 0 ; i<f.length; i++){
                        list(f[i]);
                    }
                }
            }else {
                //如果不是目录，直接输出路径
                System.out.println(file);
            }
        }
    }


    public static void main(String[] args){
        File my = new File("src/src/CP7");
        list(my);
    }
}
