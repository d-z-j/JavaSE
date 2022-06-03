public class P25 {
    //代码块和静态代码块

    //代码块只在创建对象时执行一次,在构造方法之前执行
    {
        System.out.println("我是代码块");
    }

    P25(){
        System.out.println("我是构造方法");
    }

    //静态代码块,在类刚加载时就会调用
    static int a;

    static {
        a = 10;
    }

    public static void main(String[] args) {
        P25 p25 = new P25();
        System.out.println(P25.a);
    }
}
