package CP2;
//运用continue语句打印0-9的三角形乘法表
public class test2_12 {
    public static void main(String[] args){

        out:    for (int u=0; u <= 9; u++){
            for (int v = 0; v <= 9; v++){
                if (v > u){
                    System.out.println();
                    continue out;
                }else {
                    System.out.print(u*v + "\t");
                }
            }
        }

        System.out.println();

        for (int i = 0; i<=9; i++){
            for (int j = 0; j<=i; j++){
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }
}
