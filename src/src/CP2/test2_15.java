package CP2;
//输出杨辉三角前6行
public class test2_15 {
    public static void main (String[] args){
        int y[][] = new int[6][];
        for (int i =0 ; i<y.length; i++){
            //每一行的数组的个数（长度）为上一行加一
            y[i] = new int[i+1];

            y[i][0] = 1;
            y[i][i] = 1;
            for (int j =0; j < y[i].length - 1; j++){
                //从第三行第二个开始赋值
                if (j >= 1 && i >1){
                    y[i][j] = y[i-1][j] + y[i-1][j-1];
                }
            }
        }

        for (int i =0; i<6; i++){
            for (int j =0; j<y[i].length; j++){
                System.out.print(y[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
