public class p52<T extends Number> {   //泛型的界限 extends上界 super下界
    private final String name;
    private final String id;
    private T score;

    public p52(String name, String id, T score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public T getScore(){
        return score;
    }

    //钻石运算符
    P50<String> s = new P50<>(" ","","");
}
