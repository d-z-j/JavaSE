public class P88 {
    //线程的中断
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("线程开始运行");
            while(true){
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("发现中断信号，复位");
                    Thread.interrupted();   //复位方法
                }
            }
        });
        t.start();
        try {
            Thread.sleep(3000);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
