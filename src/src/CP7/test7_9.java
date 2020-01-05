package CP7;

import com.sun.deploy.net.FailedDownloadException;

import java.io.*;

public class test7_9 {
    public static void main(String[] args){

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/src/CP7/MyDir/test.txt"));
            bufferedWriter.write("白日依山尽");
            bufferedWriter.newLine();
            bufferedWriter.write("黄河入海流");
            bufferedWriter.newLine();
            bufferedWriter.write("欲穷千里目");
            bufferedWriter.newLine();
            bufferedWriter.write("更上一层楼");
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("古诗一首..");
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("src/src/CP7/MyDir/test.txt"));
            String s;
            for (s = bufferedReader.readLine(); s !=null; s = bufferedReader.readLine()) {
                System.out.println(s);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
