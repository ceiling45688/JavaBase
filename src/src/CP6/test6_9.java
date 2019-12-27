package CP6;

public class test6_9 {
    static int compute(String num1, String op, String num2)
        throws OperatorException,ArithmeticException,NumberFormatException{
        int n1 , n2;
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        if(op.equals("-")){
            return n1 - n2;
        }else if(op.equals("+")){
            return n1 + n2;
        }else if(op.equals("*")) {
            return n1 * n2;
        }else if(op.equals("/")) {
            return n1 / n2;
        }else {
            throw new OperatorException(op);
        }
    }

    public static void main(String[] args){
        try {
            System.out.println(compute("1","*","2"));
            System.out.println(compute("1","^","2"));
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
class OperatorException extends Exception {
    private String message;
    OperatorException(String mes){
        super(mes);
        message = mes;
    }
    @Override public String getMessage(){
        return "operator: " + message + " is not a correct operator!";
    }
}
