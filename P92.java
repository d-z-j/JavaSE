public class P92 {
    //wait notify notifyAll 方法
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        Thread t1 = new Thread(()->{
            synchronized (o1) {
                try {
                    System.out.println("开始等待");
                    o1.wait();                      //进入 等待 状态并释放锁
                    System.out.println("等待结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread t2 = new Thread(()->{
            synchronized (o1){
                System.out.println("线程2开始运行,占用01对象锁");
                o1.notify();    //运行结束后 唤醒 等待状态的线程
                for (int i = 0; i < 50; i++) {
                    System.out.println(i);
                }
            }
        });
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
