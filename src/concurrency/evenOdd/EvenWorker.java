package concurrency.evenOdd;

import java.util.concurrent.locks.Lock;

public class EvenWorker implements Runnable{
    private Lock lock;

    public EvenWorker(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (lock) {
                if(Main.curr > Main.endVal) {
                    break;
                }
                if(Main.curr % 2 == 0) {
                    System.out.println("Even" + Main.curr);
                    Main.curr++;
                }
            }
        }
    }
}
