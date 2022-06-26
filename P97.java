public class P97 {
    //类的加载
    public static void main(String[] args) {
        System.out.println(P97.class.getClassLoader());
        System.out.println(P97.class.getClassLoader().getParent());
        System.out.println(P97.class.getClassLoader().getParent().getParent());
        System.out.println(String.class.getClassLoader());

    }
}
