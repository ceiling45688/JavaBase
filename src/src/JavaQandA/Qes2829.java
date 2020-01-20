package JavaQandA;



public class Qes2829 {
    public static void main(String[] args){
        String s1 = new String("Hello");
        String s2 = new String("there");
        String s3 = new String();
        s3 = s1 + s2;
        //String 不可以用 -
//        s3 = s1 - s2;
        // String 不可以用&, &&
//        s3 = s1 & s2;
//        s3 = s1 && s3;
        System.out.println(s3);// Hellothere

        //按位或 op  0100 | 0011 = 0111
        System.out.println(4 | 3);
        //
        Integer ten = new Integer(10);
        Long nine = new Long(9);
        System.out.println(ten + nine);
        int i = 1;
        System.out.println(i + ten);

        //String substring(begin,end) --> return [begin, end)
        // char -> int 自动类型转换
        String bicycle = new String("bicycle");
        int begin = 1;
        char end = 3;
        System.out.println(bicycle.substring(begin,end));



    }
}
