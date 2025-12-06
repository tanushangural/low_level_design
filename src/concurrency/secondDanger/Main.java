package concurrency.secondDanger;

public class Main {
    public static volatile int curr = 1;
    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread1 = new Thread(new Worker(1,lock));
        Thread thread2 = new Thread(new Worker(2,lock));
        Thread thread3 = new Thread(new Worker(3,lock));
        Thread thread4 = new Thread(new Worker(4,lock));
        Thread thread5 = new Thread(new Worker(5,lock));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}

/*

Second danger of concurrency is memeory visibility

suppose 2 thread are there , there will have their own copy of variables like currVal here, whenever they update the values currVal,
they need to update the copy of currVal in the main memory as well, but suppose thread1 have update the copy inside its own variable
and he has copy it in main mameory and just before updating the main memory some thread can read the older values from main memory,

if we use volatile keyword with variable currVal, then whenever values get updated in thread's copy , then it will update in the ram immediately

t1 currVal

t2 currVal


* */
