package JavaQandA;

/**
 * 线程
 */
public class Qes19 extends Thread{
    static String sName = "vandeleur";
    public static void main(String[] args){
        Qes19 t = new Qes19();
        t.piggy(sName);
        System.out.println(sName);
    }
    public void piggy(String sName){
        sName = sName + " wiggy";

        start();
    }

    @Override public void run(){
        for (int i = 0; i< 4; i++){
            sName = sName + " " + i;
        }
    }

}

