public class P43 {
    //二分搜索
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,6,7,10,12,14,20,22,26};
        System.out.println(test(arr, 20));
    }

    private static int test(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;   //下标 = 长度 - 1
        while(start <= end){        //判断的前提
            int mid = (start + end + 1)  / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) end = mid - 1;
            if (arr[mid] < target) start = mid + 1;
        }
        return -1;
    }
}
