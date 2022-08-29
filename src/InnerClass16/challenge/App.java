package InnerClass16.challenge;

public class App implements Runnable {
    private String name = "Mickey Mouse";

    class Runner2 implements Runnable {
        @Override
        public void run() {
            System.out.println(name);
        }
    }

    static class Runner3 implements Runnable {
        private String name;
        public Runner3(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        new App().start();
    }

    public void start() {
        // App implements runnable
        activate(this);

        // Anonymous class
        activate(new Runnable() {
            @Override
            public void run() {
                System.out.println(name);
            }
        });

        // Method local inner class
        class Runner1 implements Runnable {
            @Override
            public void run() {
                System.out.println(name);
            }
        }

        activate(new Runner1());

        // none static inner class
        activate(new Runner2());

        activate(new Runner3(name));
    }

    public void activate(Runnable runnable) {
        runnable.run();
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
