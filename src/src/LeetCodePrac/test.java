package LeetCodePrac;//package JavaBase.LeetCodePrac;
//
//
//
//import java.util.ArrayList;
//
//public class Snapshot {
//    private ArrayList<Integer> data;
//
//    public Snapshot(ArrayList<Integer> data) {
//        this.data = data;
//    }
//
//    public ArrayList<Integer> restore() {
////        int temp;//定义一个临时变量
////        for(int i=0;i<arr.length-1;i++){//冒泡趟数
////            for(int j=0;j<arr.length-i-1;j++){
////                if(arr[j+1]<arr[j]){
////                    temp = arr[j];
////                    arr[j] = arr[j+1];
////                    arr[j+1] = temp;
////                }
////            }
//
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        Snapshot snap = new Snapshot(list);
//        list.set(0, 3);
//        list = snap.restore();
//        System.out.println(list); //It should log "[1,2]"
//        list.add(4);
//        list = snap.restore();
//        System.out.println(list); //It should log "[1,2]"
//    }
//}