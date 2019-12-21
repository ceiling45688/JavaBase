package CP2;
//输出1949-2006的所有闰年
public class test2_3 {
    public static void main (String[] args){
        int i;
        for (i=1949; i<=2006; i++){
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
                System.out.println(i + "\n");
            }
        }



    }
}
