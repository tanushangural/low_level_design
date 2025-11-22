package concurrency.SingletonClassWithInConcurrency;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Worker());
        Thread t2 = new Thread(new Worker());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
