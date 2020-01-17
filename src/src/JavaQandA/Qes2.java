package JavaQandA;

abstract class MineBase{
    abstract void amethod();
    static int i;
}

public class Qes2  {
    public static void main(String arguments[]) {

        System.out.println(Byte.MAX_VALUE);

        int i=0;
        switch (i){
            default:
                System.out.println("default!");
            case 0:
                System.out.println("zero!");
                break;
            case 1:
                System.out.println("one!");
        }

        if (true == true){System.out.println("so true");}
    }
    public void amethod(String[] arguments) {
        System.out.println(arguments);
        System.out.println(arguments[1]);
    }
}
