public class P50<T>implements P53<T> {   //泛型类。T代表type。
    //泛型。泛型是一种语法，用于指定类型
    String name;
    String id;
    //Object score;
    T score;        //T为泛型，根据用户提供的类型自动变成对应类型。泛型只能用于对象，不能直接用于静态成员变量

    public P50(String name, String id, T score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public static void main(String[] args) {
        //P50 score = new P50("数据结构","1",50.0);
        //P50 score1 = new P50("数据结构","1","优秀");

        //String str = (String) score.score;      //类型转换错误。要事先知道是什么类型才能正确转换

        P50<String> score1 = new P50<String>("数据结构","1","优秀");     //定义时要明确类型，且不能用基本类型

        String  i = score1.score;

    }

    @Override
    public T getScore() {
        return null;
    }

    @Override
    public void setScore(T t) {

    }
}
