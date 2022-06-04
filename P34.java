public class P34 {      //类声明为final，就不能被继承。同理方法声明为final，就不能在其子类被重写
    private String name;
    private int age;

    public P34(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void study(){
        System.out.println("我爱学习！");
    }

    public static void main(String[] args) {
        P34 p34 = new P34("lbw",10);
        System.out.println(p34.getName());

        P34_1 p34_1 = new P34_1("伞兵一号",10);
        p34_1.study();


        //向上转型对象
        P34 s = new P34_1("上转型",1);
        s.study();      //向上转型对象调用的方法还是new后面的类中的方法

        System.out.println(s instanceof P34_1);

        test(s);
        //P34_1 s1 = (P34_1) s;       //向下转型，强制转换为P34_1类型
        //s1.sport();
    }

    //instanceof判断子类是那种类型
    public static void test(P34 p34){
        if (p34 instanceof P34_1){
            P34_1 s1 = (P34_1) p34;
            s1.sport();
        }else if (p34 instanceof P34_2){
            P34_2 s1 = (P34_2) p34;
            s1.art();
        }
    }
}
