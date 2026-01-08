package concurrency.evenOdd;

import java.util.concurrent.locks.Lock;

public class OddWorker implements Runnable{

    private Lock lock;

    public OddWorker(Lock lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (lock) {
                if(Main.curr > Main.endVal) {
                    break;
                }
                if(Main.curr % 2 != 0) {
                    System.out.println("Odd" + Main.curr);
                    Main.curr++;
                }
            }
        }
    }
}
