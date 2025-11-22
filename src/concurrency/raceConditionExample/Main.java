package concurrency.raceConditionExample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumberStore numberStore = new NumberStore(0);
        Thread t1 = new Thread(new Worker(numberStore));
        Thread t2 = new Thread(new Worker(numberStore));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // same
        System.out.println(numberStore.getNumber());
    }


}
