package concurrency.raceConditionExample;

public class NumberStore {
    private int number;
    public NumberStore(int number) {
        this.number = number;
    }

    public void incrementNumber() {
        this.number++; // x = x+1, 3-steps process in curcurrency:
        // 1. fetch value
        // 2. x+1
        // 3 write it
    }

    public int getNumber() {
        return number;
    }
}
