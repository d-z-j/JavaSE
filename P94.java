import java.util.Timer;
import java.util.TimerTask;

public class P94 {
    //定时器
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                timer.cancel();
            }
        },1000);

    }



    //简易的手写版本
    /**public static void main(String[] args) {
        new TimerTask(() -> System.out.println("我是定时任务"),3000).start();
    }
    static class TimerTask{
        Runnable task;
        long time;

        public TimerTask(Runnable task, long time) {
            this.task = task;
            this.time = time;
        }

        public void start(){
            new Thread(()->{
                try {
                    Thread.sleep(time);
                    task.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }**/
}
