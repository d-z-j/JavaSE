import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class P64 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.offer("a");    //入队
        System.out.println(list.poll()); //出队
        System.out.println(list.poll()); //出队
        list.push("a");
        list.push("b");     //入栈
        list.push("c");
        System.out.println(list.pop());
        System.out.println(list.pop());     //出栈
        System.out.println(list.pop());

        //利用匿名内部类创建一个带有元素的线性表
        LinkedList<Integer> linkedList = new LinkedList<Integer>(){   //jdk9支持钻石运算符
            //代码块
            {
                this.add(2);
                this.add(1);
                this.add(3);
            }
        };

        //用Arrays工具类可以更快生成带有元素的线性表。但是只读
        //List<String> list1 = Arrays.asList("a","b","c");

        System.out.println(linkedList);

        //排序
        linkedList.sort((o1, o2) -> {
            return o1 - o2;
        });
        System.out.println(linkedList);

        //可用foreach方法遍历线性表
        for (Integer i : linkedList
             ) {
            System.out.println(i);
        }
        //也可以用list自带的forEach
        linkedList.forEach(i -> {
            System.out.println(i);
        });
    }
}
