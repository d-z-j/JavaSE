public class P87 {
    public static void main(String[] args) throws InterruptedException {

        //线程终止
        Thread t = new Thread(() ->{
            Thread me = Thread.currentThread();
            for (int i = 0; i < 50; i++) {
                System.out.println(i);
                if (i == 20) me.stop();
            }
        });
        t.start();

        //线程休眠sleep
        /**System.out.println(1);
        Thread.sleep(1000);
        System.out.println(2);
        Thread.sleep(1000);
        System.out.println(3);
        Thread.sleep(1000);**/


        /**Thread t = new Thread(() -> {
            System.out.println("lbwnb");
            System.out.println(Thread.currentThread().getName()+"线程正在运行：1-100的和");
            int sum = 0;
            for (int i = 0; i <= 100 ; i++) {
                sum += i;
            }
            System.out.println(sum);
        });
        t.start();  //调用线程t

        System.out.println("main");**/
    }
}
