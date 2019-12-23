package CP5;
//下一句，一般情况下如果一个类实现了一个泛型接口，则此类通常也是泛型类
public class AnimalInfo<T extends Animal> implements Info<T> {
    @Override public void print(T ob){
        System.out.println(ob.toString());
    }

    public static void main(String[] args){
        AnimalInfo<Animal> ag = new AnimalInfo();
        ag.print(new Cat("Tom"));
        ag.print(new Mouse("Jerry"));
    }
}
interface Info <T>{
    void print(T ob);
}
class Animal{
    @Override public String toString(){
        return "this is an animal";
    }
}
class Cat extends Animal {
    private String name ;
    public Cat(String name){
        this.name = name;
    }
    @Override public String toString(){
        return super.toString() + ", cat's name is "+ name;
    }
}
class Mouse extends Animal {
    private String name;
    public Mouse(String name){
        this.name = name;
    }
    @Override public String toString(){
        return super.toString() + ", mouse's name is "+ name;
    }
}
