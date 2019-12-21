package CP4;
//向上转型：父类变量引用子类对象
public class test4_11 {
    public static void main(String[] args){
        Vehicle v = new Car();
        v.print();
        v.drive();//子类方法覆盖了父类方法
        //以下代码为错误代码，因为父类类型中没有该方法。
        //v.getBrand();

//        这也是不可以哒！
//        Car bmw = new Vehicle();

    }
}
class Vehicle {
    void print(){
        System.out.println("Vehicle!");
    }
    void drive(){
    }
}

class Car extends Vehicle {
    String brand = "BMW";


    @Override
    void drive() {
        System.out.println("car is driving!");
    }

    public String getBrand(){
        return  brand;
    }
}
