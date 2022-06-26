public class P99 {
    public static void main(String[] args) {
        String str = " ";
        System.out.println(str.getClass() == String.class);

        //判断是否为子类或者是接口
        Integer i = 10;
        i.getClass().asSubclass(Number.class);
        //获取父类的class
        i.getClass().getSuperclass();
    }
}
