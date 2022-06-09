import java.util.Iterator;
import java.util.LinkedList;

public class P65 {
    //迭代器
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        //可用foreach方法遍历线性表
        for (Integer i : list
        ) {
            System.out.println(i);
        }
        //也可以用list自带的forEach
        list.forEach(System.out::println);

        //replace方法操作整个线性表
        list.replaceAll(integer -> integer + 1);
        System.out.println(list);

        //用迭代器遍历线性表，foreach的本质。
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
        }
    }
}
