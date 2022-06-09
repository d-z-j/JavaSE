import java.util.HashMap;
import java.util.Map;

public class P70 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(3,"D"); //更新对应键的值，此时为 3 = D

        map.compute(3,(k,v) ->{     //compute会将指定key的值进行重新计算，若key不存在，v会返回null
            return v + "M";             //这里返回原的value+M
        });

        map.computeIfPresent(3,(k,v) ->{    //当k存在时则计算并赋予新的值，不存在时就不计算
            return v + "M";
        });

        map.computeIfAbsent(0,(k) -> {      //如果键不存在，则将键值对插入到map中
            return "M";
        });
        System.out.println(map);

        //merge方法用于处理数据
    }
}
