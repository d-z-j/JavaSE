public class P20 {
    String name;
    int age;
    //成员方法，属于对象。
    void swap(int a,int b){
        int c = a;
        a = b;
        b = c;
    }

    public static void main(String[] args) {
        int a = 1,b = 2;
        P20 p20 = new P20();
        p20.swap(a,b);      //基本类型只在方法体内交换
        System.out.println(a);      //输出的a依然是1
    }
}
