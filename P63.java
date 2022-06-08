import java.util.ArrayList;
import java.util.List;

public class P63 {
    //ArrayList
    // >> 向右移一位，相当于处以二
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(100);      //默认长度为0
        list.add("a");
        list.add("b");
        System.out.println(list.contains("a")); //contains调用的equals方法
    }

}
