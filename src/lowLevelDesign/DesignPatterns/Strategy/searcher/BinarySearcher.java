package lowLevelDesign.DesignPatterns.Strategy.searcher;

import java.util.List;

public class BinarySearcher implements Searcher{
    @Override
    public Integer search(Integer key, List<Integer> numberList) {
        int low = 0, high = numberList.size() - 1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(numberList.get(mid) == key) {
                return mid;
            }
            else if(numberList.get(mid) < key) {
                mid = low + 1;
            }
            else {
                mid = high - 1;
            }
        }
        return -1;
    }
}
