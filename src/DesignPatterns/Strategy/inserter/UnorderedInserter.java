package DesignPatterns.Strategy.inserter;

import java.util.List;
import java.util.Random;

public class UnorderedInserter implements Inserter{
    @Override
    public void insert(Integer number, List<Integer> numberList) {
        numberList.add(number);
    }
}
