import java.util.Arrays;
import java.util.Collections;

public class P73 {
    //Arrays
    public static void main(String[] args) {
        int[] array = {1,5,2,4,7,3,6};
        Arrays.sort(array);         //底层会进行判断，选择合适的算法
        //System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,3));   //二分搜索

        //也可以将数组转化为流操作
        Arrays.stream(array).sorted().forEach(System.out::println);

        int[] arrays1 = Arrays.copyOf(array,array.length);  //复制一个一摸一样的数组
        System.out.println(array.equals(arrays1));      //比较两个数组是否相同

        Arrays.fill(array,0);       //将数组的所有值全部填充为指定值
        System.out.println(Arrays.toString(array));

        Arrays.setAll(array, i -> array[i] + 2);    //依次计算每一个元素，此处为加二
        System.out.println(Arrays.toString(array));

        //对于二维数组提供了deepToString 和 deepEquals

        //atList方法可以将数组转变为list，但是长度是固定的，不能进行添加移除操作。

        
        //Collections
        Collections.emptyMap();
    }
}
