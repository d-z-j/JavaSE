public class P10 {
    public static void main(String[] args) {
        //隐式类型转换，字节数小的类型自动转换为字节数大的类型，整数类型自动转换为小数类型
        byte b = 9;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(d);

        //显示类型转换，牺牲精度进行转换
        int i1 = 128;
        byte b1 = (byte) i1;
        System.out.println(b1);

        //数据类型自动提升
        //参与运算时，byte short char 类型的值将被提升到int类型
        byte b2 = 105;
        //b2 = b2 + 1;    //报错
        b2 = (byte) (b2 + 1);
    }
}
