public class P91 {

   private static int value = 0;

    private static synchronized void add(){         //在方法名前面添加该关键字也可以同步
        value++;
    }

    public static void main(String[] args)throws InterruptedException {
        Thread t1 = new Thread(()-> {
            for (int i = 0; i < 10000; i++) add();
            System.out.println("线程1完成");
        });
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 10000; i++) add();
            System.out.println("线程2完成");
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(value);


        /**Thread t1 = new Thread(()-> {
            for (int i = 0; i < 10000; i++) {
                synchronized (P89.class){       //线程锁synchronized。两个线程传入的对象相同时，锁，保持原子性；对象不同时，反之。
                    value++;
                }
            }
            System.out.println("线程1完成");
        });
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 10000; i++) {
                synchronized (P91.class){
                    value++;
                }
            }
            System.out.println("线程2完成");
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(value);**/
    }
}
