public class P44 {
    //快速排序
    //将基准值中位数放到最中间，然后从中间将数组分割为左右两部分再调用方法
    public static void main(String[] args) {
        int[] arr = new int[]{9,2,1,4,5,7,8,6,3,0};
        QuickSort(arr,0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void QuickSort(int[] arr,int start,int end) {
        if (start >= end) return;
        int k = arr[start];
        int low = start;
        int high = end;
        if (low < high) {
            while(low < high && k <= arr[high]) high--;
            arr[low] = arr[high];
            while(low < high && k >= arr[low]) low++;
            arr[high] = arr[low];
        }
        arr[high] = k;

        QuickSort(arr,start,high - 1);
        QuickSort(arr,low + 1,end);
    }

}
