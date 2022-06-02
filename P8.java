import java.math.BigInteger;

public class P8 {
    public static void main(String[] args) {

        //整数类型：byte short int long
        //整数还能使用8进制和16进制表示，不能用二进制表示

        byte b = 10;    //byte的范围-128～127
        short s = 128;
        int i = 5000000;
        long l = 2000000000000000l; //long类型在数字后面加l或L
        BigInteger j = new BigInteger("1234567899876543215467897415456");

        byte b1 = 127;
        System.out.println((byte)(b1 + 1)); //输出-128，补码规则导致二进制第一位变成了1，其余位变成了0。

        //字符类型：char

        char c = 'l';
        String str = "lbwnb";    //字符串不是基本类型，是引用类型。
    }
}
