import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P95 {

    public static void main(String[] args) throws InterruptedException {
        //并行方法
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,5,2,9,3,6,0));
        list
                .parallelStream()       //获得并行流
                .forEach(i -> System.out.println(Thread.currentThread().getName()+"->"+i));  //乱序输出.forEachOrdered可以正序输出



        //守护线程,不合适IO操作
        //在所有线程都执行完毕后，守护线程自动结束
        /**Thread t1 = new Thread(()->{
           while (true){
               System.out.println("程序正常运行中");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        t1.setDaemon(true);     //设置为守护线程（必须在开始之前，中途不允许转换）
        t1.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }**/
    }
}
