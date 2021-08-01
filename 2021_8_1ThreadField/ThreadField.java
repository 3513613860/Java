package thread2.basic;

public class Demo07 {
    public static void main(String[] args) throws InterruptedException {
        Thread  t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                System.out.println("线程ID："+thread.getId());
                System.out.println("线程名称："+thread.getName());
                System.out.println("线程状态："+thread.getState());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        Thread.sleep(100);
        System.out.println("线程状态："+t1.getState());
        System.out.println("线程优先级："+t1.getPriority());
        System.out.println("是否为守护线程："+t1.isDaemon());
        System.out.println("是否存活："+t1.isAlive());
        System.out.println("是否中断："+t1.isInterrupted());

    }
}
