package CP4;

public class test4_10 {
    public static void main(String[] args) {
        Father father = new Father();
        father.printF();
        Child child = new Child();
        child.printC();

        child.y -= 30; //减得是子类同名变量，对父类同名变量没有影响
        child.printF();//打印的是从父类继承来的同名成员变量,这是被隐藏的成员变量
        child.printC();
    }
}

class Father {
    double y = 10.5;

    public void printF(){
        System.out.println(y);
    }
}

class Child extends Father {
    double y = 20.5;
    public void printC(){
        y += 10;
        System.out.println("super.y = "+ super.y+ "sub.y = "+ y);
    }
}
