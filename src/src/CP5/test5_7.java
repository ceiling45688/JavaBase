package CP5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class test5_7 {
    public static void main(String[] args){
        List<String> a = new LinkedList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        List<String> b = new LinkedList<String>();
        b.add("A");
        b.add("B");
        b.add("C");
        b.add("D");
        //把b中的元素间隔插入a中
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();
        while (bIter.hasNext()){
            //hastNext()为空返回false
            if (aIter.hasNext()){
                //注意，第一次循环时，next（）获取的是第一个元素
                aIter.next();
            }
            aIter.add(bIter.next());
        }
        System.out.println(a);

        //b中每间隔一个元素删除一个元素
        bIter = b.iterator();
        //相当于是两个一组跳
        while (bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();//删除刚刚跳过的元素
            }
        }
        System.out.println(b);

        //删除a中和b相同的元素
        a.removeAll(b);
        System.out.println(a);
    }
}
