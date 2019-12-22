package CP4;
//与接口相关的多态性,体现在接口回调
public class test4_21 {
    public static void main(String[] args){
        MotherBoard motherBoard = new MotherBoard();
        motherBoard.plugin(new NetWorkCard());//NWC实现了PCI接口，故其引用可调用plugin方法
        motherBoard.oprate();
        motherBoard.plugin(new SoundCard());//同上
        motherBoard.oprate();
    }
}
interface PCI {
    String show();
    void operate();
}
class NetWorkCard implements PCI {
    @Override public String show(){
        return "网卡";
    }
    @Override public void operate(){
        System.out.println("我在传输网络数据！");
    }
}
class SoundCard implements PCI {
    @Override public String show(){
        return "声卡";
    }
    @Override public void operate(){
        System.out.println("我在播放声音！");
    }
}

class MotherBoard {
    PCI pci;

    MotherBoard(){
        System.out.println("我是主板！");
    }
//这里的参数为接口类型，注意，只要任一实现了该接口的对象，则该对象的引用就可以作为参数来调用方法
    void plugin(PCI in){
        pci = in ;//把方法内部变量赋值给成员变量
        System.out.println(in.show() + "插入到PCI插槽中！");
    }
    void oprate(){
        pci.operate();
    }
}