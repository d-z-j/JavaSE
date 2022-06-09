import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class P72 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str = null;
        /** if (str != null){
            list.add(str);
        }**/
        Optional<String> optional = Optional.ofNullable(str);
        //optional.ifPresent(System.out::println);
        System.out.println(optional.orElse("lbwnb"));

    }
}
