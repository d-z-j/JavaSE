public class P11 {
    public static void main(String[] args) {
        //赋值运算符 =
        //算术运算符 + - * / %

        // + 可以连接字符串；也可以连接字符串和数字，但是若字符串在数字前面，数字会被当作字符串处理。
        byte b = 105;
        byte c = 10;
        System.out.println("lbw" + "nb");
        System.out.println("lbw" + b + c);
        System.out.println(b + c + "lbw");      //数字在前面就正常运行
        System.out.println("lbw" + (b + c));    //可以用括号来解决

        //自增 ++；自减 --
        int a = 10;
        System.out.println(a++);    //++在a后，先返回值，再自增
        //System.out.println(++a);  //++在a前面，先自增，再返回值

        int d = 2;
        int e = 10;
        System.out.println(d+++e++);

        e += 2; //等价于e = e + 2；

        //取余 %
        //关系运算符 > < ==  !=  >=  <= ,结果是布尔类型的值

        //逻辑运算符 && || !

        //位运算符 & | ^ ~
        int f = 7, g = 15;
        System.out.println(f & g);

        //三目运算符
        //判断条件（只能是boolean类型的返回值）? 满足的返回值 : 不满足的返回值
        String str = f > g ? "行" : "不行";
        System.out.println(str);
    }
}
