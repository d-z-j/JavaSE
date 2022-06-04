public class P38 {
    //成员内部类
    class Inner{

    }

    //静态内部类
    static class A{

    }

    //局部内部类。只在方法体内有效

    //匿名内部类。无法敷用，只能使用一次。
    P37 eat = new P37() {
        @Override
        public void eat() {

        }
    };

    public static void main(String[] args) {
        //创建成员内部类的对象
        P38 p38 = new P38();
        P38.Inner inner = p38.new Inner();

        //创建静态内部类的对象
        P38.A a = new P38.A();
    }
}
