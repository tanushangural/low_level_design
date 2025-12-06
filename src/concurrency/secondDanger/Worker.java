package concurrency.secondDanger;

public class Worker implements Runnable{
    private int val;
    private final Object lock;

    public Worker(int val, Object lock) {
        this.val = val;
        this.lock = lock;
    }
    @Override
    public void run() {
//        synchronized (lock) {
//            while(Main.curr < val) {}
//        }
        while (compare()) {}
        System.out.println(this.val);
        synchronized (lock) {
            Main.curr ++;
        }
    }

    private boolean compare() {
        boolean ans;
        synchronized (this.lock) {
            ans = Main.curr < val;
        }
        return ans;
    }
}
