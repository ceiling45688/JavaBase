package CP6;
/** 如果在一个方法中发生了异常（下例中method（）除数为零异常），而该方法有没有对异常进行处理，则异常会被该方法的调用方法来进行处理。
 * （一级一级往上穿，如果整个程序都没有对该异常进行处理，则最终会传到java运行时系统进行处理：终止程序，并给出异常类型及代码行数）*/
public class test6_5 {
    public static void main(String[] args){
        int choice;
        String str = "0";
        choice = Integer.valueOf(str).intValue();
        try {
            method(choice);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    static void method(int choice){
        int[] myArray = new int[10];
        myArray[0] = 10 / choice;
    }
}
