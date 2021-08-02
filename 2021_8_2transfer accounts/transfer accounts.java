package thread2.basic;

public class Demo13 {
    static volatile boolean  quit = false;
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (!quit){
                    System.out.println(Thread.currentThread().getName()+
                            "正在转账呢");
                }
                System.out.println("险些误了大事");
            }
        };

        Thread t = new Thread(r,"张三");
        System.out.println(Thread.currentThread().getName()+"让张三开始转账");
        t.start();
        Thread.sleep(1);
        System.out.println(Thread.currentThread().getName()+"通知张三，停止转账，对方是骗子");
        quit = true;

    }
}
