package CP7;

import java.io.File;
import java.io.IOException;

public class test7_1 {
    public static void main(String[] args){

        //绝对路径，注意win中盘符！！
        File myFile = new File("E:\\+++++++++++++Soft2++++++++++\\IDEA\\JavaBase\\src\\src\\CP7\\MyDir");
        if (myFile.mkdir()){
            System.out.println("success!");
        }else {
            System.out.println("failed!");
        }
        //通过工程相对路径！
        File myFile_A = new File("src/src/CP7/MyDir/test");
        if (myFile_A.mkdir()){
            System.out.println("success!");
        }else {
            System.out.println("failed!");
        }
        File file = new File("src/src/CP7/MyDir/test.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
        if (file.delete()){
            System.out.println("deleted!");
        }else {
            System.out.println("failed to delete!");
        }
    }
}
