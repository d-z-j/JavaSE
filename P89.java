public class P89 {
    //线程的优先级
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            System.out.println("线程1开始运行");
            for (int i = 0; i < 50; i++) {
                if (i % 5 == 0){
                    System.out.println("让位");
                    Thread.yield();         //让位给同级别的线程2
                }
                System.out.println("线程1打印："+i);
            }
            System.out.println("线程1结束");
        });
        Thread t2 = new Thread(() ->{
            System.out.println("线程1开始运行");
            for (int i = 0; i < 50; i++) {
                System.out.println("线程2打印："+i);
                if (i % 5 == 0){
                    System.out.println("让线程1加入");
                    try {
                        t1.join();      //加入线程1
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();

        //优先级设定
        /**Thread t = new Thread(() -> {
            System.out.println("线程开始运行");
        });
        t.start();
        t.setPriority(Thread.MAX_PRIORITY);     //最大的概率获取cpu资源**/
    }
}
