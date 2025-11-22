package concurrency.concurrentSumInArray;

import java.util.List;

public class WorkerSum implements Runnable{
    private final Integer startIdx, endIdx;
    private final List<Integer> list;

    public WorkerSum(Integer startIdx, Integer endIdx, List<Integer> list) {
        this.startIdx = startIdx;
        this.endIdx = endIdx;
        this.list = list;
    }

    @Override
    public void run() {
        Long sum = 0L;
        for(int i=startIdx; i<=endIdx; i++) {
            sum += list.get(i);
        }
        Main.atomicSum.addAndGet(sum);
        Main.atomicCount.incrementAndGet();
    }
}
