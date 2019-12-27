package CP6;

public class test6_8 {
    static int doDivide(int a, int b) throws DivideZeroException {
        if (b == 0) {
            throw new DivideZeroException("error zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args)  {
        try {
            int b = doDivide(10, 0);
        }catch (DivideZeroException e){
            System.out.println(e.toString());
        }
    }
}
class DivideZeroException extends Exception {
    DivideZeroException(String mes){
        super(mes);
    }
}
