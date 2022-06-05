public class P46 {

    //异常机制
    //运行时异常
    public static void main(String[] args) {
        test(1,0);
    }

    private static int test(int a, int b) {
        return a/b;
    }

    //编译时异常
    //int i = 10


    //错误
    int[] arr = new int[Integer.MAX_VALUE];
}
