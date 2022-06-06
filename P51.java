public class P51<T> {
    String name;
    String id;
    T score;

    public P51(String name, String id, T score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public T getScore(){    //泛型方法
        return score;
    }

    public void setScore(T score){
        this.score = score;
    }

    public static <E> void test(E e){       //静态方法，在方法前面声明泛型
        System.out.println(e);
    }

    public static void main(String[] args) {
        P51<Integer> score1 = new P51<Integer>("数据结构","1",1);

        Integer i = score1.getScore();

        test(5656);
    }
}
