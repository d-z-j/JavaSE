public class P16 {
    //水仙花数
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {        //0和1不是，直接跳过
            int a = i;          //临时变量a
            int sum = 0;       //计数器sum
            while (a > 0){      //判断是否继续累加到计数器里
                int b = a % 10;     //得到个位
                sum += b * b * b;   //将个位数水仙到sum中
                a /= 10;            //得到个位以上的数
            }
            if (sum == i) System.out.println(i + "是水仙花数！");
        }
        System.out.println();
    }
}
