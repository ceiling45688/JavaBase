package CP3;
//包访问控制性
public class test3_15 {
    public static void main(String[] args){
        Bclass b = new Bclass();
        b.accessMethod();
    }
}
class Aclass {
    int x;
    void packageMethod(){
        System.out.println("packageMethod");
    }
}
class Bclass{
    void accessMethod(){
        Aclass a = new Aclass();
        a.packageMethod();
        a.x = 3;
        System.out.println(a.x);
    }
}