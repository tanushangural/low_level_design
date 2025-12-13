package concurrency.secondDanger;

public class Worker implements Runnable{
    private int val;
    private final Object lock;

    private int rounds;

    public Worker(int val, Object lock, int rounds) {
        this.val = val;
        this.lock = lock;
        this.rounds = rounds;
    }
    @Override
    public void run() {
//        synchronized (lock) {
//            while(Main.curr < val) {}
//        }
        while(rounds > 0) {
            while (compare()) {}
            System.out.println(this.val);
            synchronized (lock) {
                Main.curr = (Main.curr + 1)%6;
                System.out.println("cur" + Main.curr + " val" + this.val);
            }
            rounds--;
        }

    }

    private boolean compare() {
        boolean ans;
        synchronized (this.lock) {
            ans = !(Main.curr == val);
        }
        return ans;
    }
}
