package CP5;
//特例情况，此例包含了自动装箱和拆箱的知识，待学习！
public class test5_5 {
    public static void main(String[] args){
        Fibnacci gen = new Fibnacci();
        for(int i =0; i< 18; i++){
            System.out.print(gen.next() + ", ");
        }
    }
}
interface Generator<T>{
    T next();
}
class Fibnacci implements Generator<Integer>{
    private int count = 0;

    @Override public Integer next(){
        return fib(count++);
    }
    public int fib(int n){
        if (n < 2 ){
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }
}
