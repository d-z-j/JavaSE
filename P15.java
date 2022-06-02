public class P15 {
    //九九乘法表
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++){
            for (int j = 1; j < 10; j++) {
                if (j > i) break;
                System.out.printf(j + "x" + i + "=" + i * j);
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
