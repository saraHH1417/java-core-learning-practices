package Lamdas28.Threading;

public class App {
    private int value = 0;
    private synchronized void increment() {
        value++;
    }
    public void run() throws InterruptedException {
        System.out.println("**-> multiThreading");
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                increment();
            }
        };
        runnable.run();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Value isssssssss: " + value);
    }
    public static void main(String[] args) throws InterruptedException {
        new App().run();
    }


}
