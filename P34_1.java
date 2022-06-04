public class P34_1 extends P34 implements P37{
    @Override
    public void eat() {
        System.out.println("体育生吃饭！");
    }

    //继承父类时，要先实现父类的构造方法
    public P34_1(String name, int age) {
        super(name, age);
    }

    public void sport(){
        System.out.println("我是体育生!");
    }

    //方法的重写。静态方法不能重写
    @Override
    public void study() {
        super.study();      //先调用父类的方法，不需要删掉即可
        System.out.println("体育生也要好好学习！");       //在执行重写的方法内容
    }

    public static void main(String[] args) {
        P37 eat = new P34_1("LBW",10);  //接口回调
        eat.eat();
        //P34_1 s = (P34_1) eat;      //强制转换回原来的类型
        //instanceof也可以判断接口类型
        System.out.println(eat instanceof P34_1);

    }
}
