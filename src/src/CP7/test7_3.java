package CP7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test7_3 {
    public static void main(String[] args){
        FileInputStream files = null;
        int b = 0;
        try {
            files = new FileInputStream("src/src/CP7/MyDir/test.txt");
        }catch (FileNotFoundException e){
            System.out.println("file not exit!");
            System.exit(-1);
        }

        try{
            long num = 0;
            while ((b = files.read()) != -1){
                System.out.println((char) b);
                num++;
            }
            files.close();
            System.out.println();
            System.out.println("read success!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
