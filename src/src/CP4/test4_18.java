package CP4;

//运行时多态中与继承相关的多态性：
//注意：子类对象的实例方法必须通过父类类型变量进行调用，并且所用的方法（父类成员方法）必须在子类中被改写！
//多态的好处是具有良好的扩展性。
public class test4_18 {
    public static void powerOn(Monitor monitor){
        monitor.displayGraphics();
    }
    public static void main(String[] args){
        powerOn(new LCDMonitor());
        powerOn(new PlasmaMonitor());
    }
}
class Monitor{
    public void displayGraphics(){}
}
class LCDMonitor extends Monitor {
    @Override public void displayGraphics(){
        System.out.println("液晶显示器图像！");
    }
}
class PlasmaMonitor extends Monitor {
    @Override public void displayGraphics(){
        System.out.println("等离子显示器图像！");
    }
}
