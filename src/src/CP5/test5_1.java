package CP5;
//泛型类的定义和创建对象
public class test5_1 {
    public static void main(String[] args){
        Pair<String,Integer> pair = new Pair("hello", 12138);
        System.out.println(" "+ pair.getFirst()+"- "+ pair.getSecond());
    }
}
class Pair<K,V> {
    private K first;
    private V second;

    public Pair(){
        first = null;
        second = null;
    }
    public Pair(K first, V second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(K first) {
        this.first = first;
    }
    public K getFirst(){
        return first;
    }

    public void setSecond(){
        this.second = second;
    }
    public V getSecond(){
        return second;
    }
}
