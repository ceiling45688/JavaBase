package CP7;

import java.io.*;

public class Trans {
}
class Source {
    private BufferedReader bufferedReader;
    public Source(String filename){
        //判断是否从键盘读取
        if (filename.toLowerCase().compareTo("stdin") == 0){
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }else {
            try {
                bufferedReader = new BufferedReader(new FileReader(filename));
            }catch (FileNotFoundException e){
                System.out.println("file : " + filename + "is not exiting!");
                System.exit(0);
            }
        }
    }

    public String readLine(){
        String s = new String();
        try {
            s = bufferedReader.readLine();
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return s;
    }
    public void close(){
        try {
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}

class Sink{
    private BufferedWriter bufferedWriter;

}
