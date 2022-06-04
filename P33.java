public class P33 {
    public static void main(String[] args) {
        int[] arr = {8,5,0,1,4,9,2,3,6,7};
        test(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                while(arr[j] < max){
                    max = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }
}
