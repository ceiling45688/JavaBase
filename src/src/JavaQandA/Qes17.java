package JavaQandA;

public class Qes17 {
    public static void main(String[] args){
        /**
         * 强制转换错误 runtimeException -> ClassCastException
         *
         */
//        Base b = new Base();
//        Sub s =(Sub) b;

        /**
         * 除非父类是子类构造出的实例才可以强制类型转换
         */
        Base b = new Sub();
        Sub s = (Sub) b;

        /**
         * 从下往上类型转换是可以自动进行的，因为从父到子是向下兼容的。
         * 即子类可以轻松转换为父类
         */
        Sub a = new Sub();
        Base up = a;

    }
}
class Base{}
class Sub extends Base{}
class Sub2 extends Base{ }
