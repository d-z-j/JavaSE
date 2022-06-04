public class P34_2 extends P34{
    public P34_2(String name, int age) {
        super(name, age);
    }

    public void art(){
        System.out.println("我是艺术生！");
    }

    @Override
    public void study() {
        super.study();
        System.out.println("艺术生也要好好学习！");
    }
}
