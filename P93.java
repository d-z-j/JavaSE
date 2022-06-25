public class P93 {
    //Threadlocal变量. 不同线程中的local变量互不干扰
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<String> local = new ThreadLocal<>();
        Thread t1 = new Thread(()->{
           local.set("lbwnb");          //只在t1线程中生效
            System.out.println("变量值已设定");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(local.get());

        });
        Thread t2 = new Thread(()->{
            local.set("dzjnb");
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
