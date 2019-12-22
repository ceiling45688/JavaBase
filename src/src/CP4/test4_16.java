package CP4;

public class test4_16 {
    public static void main(String[] args){
        StartStop conference = new Conference();
        conference.start();
        conference.stop();
        StartStop car = new Car2();
        car.start();
        car.stop();
    }
}
interface StartStop{
    void start();
    void stop();
}
class Conference implements StartStop{
    @Override public void start(){
        System.out.println("start the conference!");
    }
    @Override public void stop(){
        System.out.println("stop the conference!");
    }
}
class Car2 implements StartStop {
    @Override public void start(){
        System.out.println("insert key in ignition and turn!");
    }
    @Override public void stop(){
        System.out.println("turn key in ignition and remove!");
    }
}