package JavaQandA;

public class MathTest {
    public static void main(String[] args){
        /**
         * static double floor(double a); 比它小的最大整数
        *  返回小于或等于参数的最大（最接近正无穷大） double值，等于一个数学整数*/
        System.out.println(Math.floor(-4.7));
        /**
         * static long round(double a) ; 四舍五入
         * 返回参数中最接近的 long ，其中 long四舍五入为正无穷大。
         *
         * static int round(float a) ;
         * 返回参数中最接近的 int ，其中 int四舍五入为正无穷大。
         */
        System.out.println(Math.round(-4.7));
        /**
         * public static double ceil(double a); 比他大的最小整数
         * 返回大于或等于参数的最小（最接近负无穷大） double值，并等于数学整数。 特殊情况：
         * 如果参数值已经等于数学整数，则结果与参数相同。
         * 如果参数为NaN或无穷大或正零或负零，则结果与参数相同。
         * 如果参数值小于零但大于-1.0，则结果为负零。
         * 需要注意的是价值Math.ceil(x)正是价值-Math.floor(-x) 。
         */
        System.out.println(Math.ceil(-4.7));
        /**
         * min (); 比较两者之间较小的那个，需要两个同类型参数
         */
//        System.out.println(Math.min(-4.7));
    }
}
