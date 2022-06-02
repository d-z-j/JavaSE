public class P14 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        double d = a/b;
        System.out.println(d);  //向下取整

        double e = a/(double)b;   //转换类型
        System.out.println(e);

        while(a < 10){
            a++;
            if (a == 5) continue;
            System.out.println(a);

        }
    }
}
