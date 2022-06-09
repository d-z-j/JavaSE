import java.util.HashMap;
import java.util.LinkedHashMap;

public class P68 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new LinkedHashMap<>();
        hashMap.put(1,"a");
        hashMap.put(3,"C");             //HashMap默认将键值对排序,LinkedHashMap则会保存编程者的顺序
        hashMap.put(2,"B");
        hashMap.get(3);         //访问之后将键值对放到最后面
        System.out.println(hashMap);
    }
}
