package CP2;
//买鸡问题，公鸡每只五元，母鸡每只三元，小鸡三只一元，用一百元买一百只鸡，问公鸡，母鸡，小鸡各能买几只？
public class test2_25 {
    public static void main(String[] args){
        int x=0, y=0, z=0;
        for(x = 0; x <= 20 ; x++){
            for (y = 0; y <= 33; y++){
                //小鸡数量
                z = 100 - x- y;
                if (5*x + 3*y + z/3 == 100)
                    System.out.println("公鸡、母鸡、小鸡只数："+ x + ", "+ y +", "+ z);
            }
        }
    }
}
