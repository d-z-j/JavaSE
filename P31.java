public class P31 {
    //冒泡排序。每一轮将最大的数推到数组后面
    public static void main(String[] args) {
        int[] arr = {8,5,0,1,4,9,2,3,6,7};
        test(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void test(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            boolean b = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    b = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1] ;
                    arr[i + 1] = temp;
                }
            }
            if (b) break;
        }
    }


}
