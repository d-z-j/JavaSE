import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P71 {
    //stream操作
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //stream操作
        //先读取操作，在执行
        list = list
                .stream()
                .filter(e -> !e.equals("B"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
