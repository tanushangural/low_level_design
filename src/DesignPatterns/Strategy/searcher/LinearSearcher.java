package DesignPatterns.Strategy.searcher;

import java.util.List;

public class LinearSearcher implements Searcher{
    @Override
    public Integer search(Integer key, List<Integer> numberList) {
        for(int i=0; i<numberList.size(); i++) {
            if(numberList.get(i) == key) {
                return i;
            }
        }
        return -1;
    }
}
