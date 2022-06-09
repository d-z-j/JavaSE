import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class P66 {
    //set集合 不允许出现重复元素 不支持随机访问
    //底层是用哈希表实现的
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(120);   //支持插入元素，但是不支持指定位置插入
        hashSet.add(13);
        hashSet.add(11);
        System.out.println(hashSet);
        for (Integer i:hashSet
             ) {
            System.out.println(i);
        }

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(120);     //自动保存插入顺序
        linkedHashSet.add(13);
        linkedHashSet.add(11);
        System.out.println(linkedHashSet);

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);         //插入规则是红黑树
        set.add(3);
        set.add(2);
        System.out.println(set);        //排序默认按照自然数从小到大
    }
}
