public class P23 {
    //构造方法
    String name;
    //用构造方法给成员变量赋初始值，右键可以快速生成
    //在定义有参构造之后默认自带的无参构造就会被覆盖。如果需要无参构造只需手动定义即可
    public P23(String name) {
        this.name = name;       //使用this关键字，区分成员变量与局部变量。this用来操作对象的属性
    }

    public static void main(String[] args) {
        P23 p23 = new P23("lbw");
        System.out.println(p23.name);
    }
}
