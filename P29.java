public class P29 {
    public static void main(String[] args) {
        //数组本身也是类，但是编程不可见，不是基本数据类型

        int[] arr = new int[10];        //声明int类型数组
        String[] arr2 = new String[10]; //声明String类型数组
        //无法直接将数字赋值给length，length为final类型变量。数组长度一旦确定，就不可变了。

        System.out.println(arr.length);

        int[] arr3 = new int[]{1,2,3};  //直接声明数组
        int[] arr4 = {1,2,3,4,5};

        System.out.println(arr2[0]);

        arr[0] = 111;
        System.out.println(arr[0]);

        //数组的遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //foreach增强for循环
        for (int i : arr
             ) {
            System.out.println(i);
        }
    }
}
