package concurrency.rounds;

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
        while(true) {
            while (compare()) {}
            synchronized (lock) {
                if(Main.rounds <= 0)
                    break;
                System.out.println(this.val);
                Main.curr = (Main.curr + 1)%6;
                if(Main.curr == 0)
                    Main.rounds--;
            }
        }

    }

    private boolean roundOver() {
        boolean ans = false;
        synchronized (lock) {
            ans = Main.rounds > 0;
        }
        return ans;
    }

    private boolean compare() {
        boolean ans;
        synchronized (this.lock) {
            ans = !(Main.curr == val) && !(Main.rounds <=0);
        }
        return ans;
    }
}
