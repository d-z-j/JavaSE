import java.util.Locale;

public class P26 {

    public static void main(String[] args) {
        String str = "lbwnb";
        System.out.println(str.toUpperCase(Locale.ROOT));       //转换为大写
        System.out.println(str.contains("abc"));        //判断是否包含
        System.out.println(str.equals("lbwnb"));        //判断两个字符串内容是否相等

        String a = "adc";
        String b = "def";
        String c = a + b;       //字符串拼接是重新创建了一个字符串对象

        //用StringBuilder拼接字符串解决上面的问题
        StringBuilder builder = new StringBuilder();
        builder.append("a").append("b");        //append()方法拼接
        System.out.println(builder);
    }
}
