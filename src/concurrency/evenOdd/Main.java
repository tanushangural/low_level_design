package concurrency.evenOdd;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static int curr = 0;
    public static int endVal = 300;
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread thread1 = new Thread(new EvenWorker(lock));
        Thread thread2 = new Thread(new OddWorker(lock));
        thread1.start();
        thread2.start();
    }
}
