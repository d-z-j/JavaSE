import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P69 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"a");
        map.put(3,"c");         //自动维护顺序
        map.put(2,"b");
        System.out.println(map);

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        System.out.println(map1.get(1));    //获取key为1的值
        System.out.println(map1.getOrDefault(0,"K"));   //不存在就返回K
        map1.remove(1); //移除key为1的键值对
        map1.forEach((k,v) -> System.out.println(k + "->" + v));
        System.out.println(map1.keySet());  //获取map中的所有键
        System.out.println(map1.values());  //获取map中的所有值
    }
}
