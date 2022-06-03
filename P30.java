public class P30 {
    public static void main(String[] args) {
        //二维数组，先行后列
        int[][] arr = {{1,2},
                        {3,4},
                        {5,6}};
        System.out.println(arr[2][1]);

        //遍历二维数组
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr[i][j]);
            }
        }
        //嵌套foreach
        for (int[] i: arr) {
            for (int a : i){
            System.out.println(a);
            }
        }

        test(1,2,3,4,5,6);  //将传入的数打包成一个数组
    }
    //可变长参数
    public static void test(int... arr){        //传入参数也可以为一维数组
        System.out.println();
        System.out.println(arr[2]);
    }
}
