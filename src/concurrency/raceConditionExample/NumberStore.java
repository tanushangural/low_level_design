package concurrency.raceConditionExample;

public class NumberStore {
    private int number;
    private final Object lock;
    public NumberStore(int number) {
        this.number = number;
        lock = new Object();
    }

    public void incrementNumber() {
//        this.number++; // x = x+1, 3-steps process in curcurrency:
        // 1. fetch value
        // 2. x+1
        // 3 write it

        // it can be avoid by locking the critical section part OR we can mark whole function synchronized as well
        synchronized (lock) {
            this.number++;
        }

    }

    public synchronized int getNumber() {
        return number;
    }
}
