package CP5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 创建一个ArrayList对象，向集合对象中添加若干元素，然后使用迭代器遍历该集合并输出这些元素。*/
public class test5_6 {
    public static void main(String[] args){
        List <String> all = new ArrayList<String>(); //实例化List接口
        all.add("hello");
        all.add("world");
        all.add("kitty");
        Iterator<String> iter = all.iterator(); // 直接实例化
        while(iter.hasNext()){
            String str = iter.next();
            System.out.print(str + " ");
            if ("world".equals(str)){
                iter.remove();
            }
        }
        System.out.println("\nafter deleter:" + all);
    }
}
