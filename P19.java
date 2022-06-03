public class P19 {
    //定义成员变量，在类体内，方法外。成员变量是属于对象的。
    String name;    //默认值为null
    int age;        //默认值为0

    public static void main(String[] args) {
        P19 p19 = new P19();    //创建一个P19类型的对象p19
        p19.name = "lbw";       //定义p19对象的name
        p19.age = 10;           //定义p19对象的age
        System.out.println(p19.name + p19.age);

        for (int i =0;i < 10; i++){
            if (i == 1) return;
        }
        System.out.println("...");
    }
}
