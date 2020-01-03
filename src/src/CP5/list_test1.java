package CP5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *  List 接口特点：
 *  1.有序集合，存储元素和取出元素的顺序是一致的；
 *  2.有索引，包含了一些带索引的方法；
 *  3.允许存储重复的元素。
 *
 *  list接口中带索引的方法（特有）：
 *  -public void add(int index, E element) :将指定元素添加到索引处；
 *  -public E get(int index): 返回集合中指定位置的元素；
 *  -public E remove(int index):返回被移除的元素
 *  -public E set(int index, E element):用指定元素替换集合中指定索引处的元素，返回更新后的元素；
 *  注意：
 *          操作索引时一定要防止索引越界异常
 *          IndexOutOfBoundsException: 索引越界异常，集合会报
 *          ArrayIndexOutOfBoundsException: 集合会报
 *          StringIndexOutOfBoundsException:字符串会报
 */
public class list_test1 {
    public static void main(String[] args){
        //创建一个list集合， 多态
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        //打印集合，
        System.out.println(list); //[a, b, c, a] 不是地址，这里重写了tostring
        //在 b 和c 之间添加一个lily
        list.add(1,"lily");//在指定索引处添加元素
        System.out.println(list);//[a, lily, b, c, a]

        String getb = list.get(1);//获取指定索引处元素，返回的是获取的元素
        System.out.println(getb);

        String removeC = list.remove(2);//移除指定位置的元素，返回的是被移除的元素
        System.out.println("被移除的元素：" + removeC);
        System.out.println(list);//[a, lily, c, a]
        //把最后一个a替换为A
        String setE = list.set(3, "A");
        System.out.println("被替换的元素：" + setE);
        System.out.println(list);

        //list集合有3中遍历方式
        //普通for
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------------");
        //使用迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("-------------------");
        //使用foreach
        for (String s : list) {
            System.out.println(s);
        }
    }
}
