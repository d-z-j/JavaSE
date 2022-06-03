public class P24 {
    //静态变量和静态方法，属于类本身,可以直接用类名调用
    //static在对象创建之前就已经运行了
    static int a = test();

    static int test(){
        return 1;
    }

    public static void main(String[] args) {
        P24.a = 10;
        System.out.println(P24.a);

        P24.test();

        System.out.println(P24.a);
    }
}
