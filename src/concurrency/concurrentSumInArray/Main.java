package concurrency.concurrentSumInArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static AtomicLong atomicSum = new AtomicLong(0L);
    public static AtomicInteger atomicCount = new AtomicInteger(0);

    public static Long seqSum(List<Integer> list) {
        Long sum = 0L;
        for(int i=0; i<list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<1000000; i++) {
            list.add(random.nextInt(0,1000));
        }
        Long startTime = System.currentTimeMillis();
        seqSum(list);
        Long endTime = System.currentTimeMillis();
        System.out.println("execution time: "+ (endTime-startTime));

        Long startTime1 = System.currentTimeMillis();
        int size = list.size() / 4;
        Thread t1 = new Thread(new WorkerSum(0,size - 1, list));
        Thread t2 = new Thread(new WorkerSum(size, 2*size - 1,list));
        Thread t3 = new Thread(new WorkerSum(2*size, 3*size - 1,list));
        Thread t4 = new Thread(new WorkerSum(3*size, 4*size - 1, list));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        while(atomicCount.get() < 4) {
        }
        Long endTime1 = System.currentTimeMillis();
        System.out.println("concurrent sum execution time: "+ (endTime1-startTime1));
    }
}
