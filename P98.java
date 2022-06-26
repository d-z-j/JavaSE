public class P98 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> clazz = String.class;     //通过class关键字，通过类名获取
        Class<?> clazz1 = Class.forName("java.lang.String");
        Class<?> clazz2 = new String("lbwnb").getClass();

        //基本数据类型也有Class对象
        Class<?> clazz3 = int.class;
        System.out.println(Integer.TYPE == int.class);
        System.out.println(Integer.TYPE == Integer.class);
    }
}
