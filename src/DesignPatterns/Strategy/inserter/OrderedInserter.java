package DesignPatterns.Strategy.inserter;

import DesignPatterns.Strategy.searcher.Searcher;

import java.util.List;

public class OrderedInserter implements Inserter {

    @Override
    public void insert(Integer number, List<Integer> numberList) {
        int i=numberList.size() - 1;
        while(i>=0 && numberList.get(i) > number) {
            i--;
        }
        i++;
        if(i == numberList.size()) {
            numberList.add(number);
            return;
        }
        int j = i+1;
        int prev = numberList.get(i);
        int len = numberList.size();
        while(j < len) {
          int cur = numberList.get(j);
          numberList.set(j, prev);
          prev = cur;
          j++;
        }
        numberList.add(prev);
        numberList.set(i, number);
    }
}
