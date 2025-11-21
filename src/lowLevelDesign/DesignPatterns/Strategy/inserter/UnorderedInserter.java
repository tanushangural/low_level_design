package lowLevelDesign.DesignPatterns.Strategy.inserter;

import java.util.List;

public class UnorderedInserter implements Inserter{
    @Override
    public void insert(Integer number, List<Integer> numberList) {
        numberList.add(number);
    }
}
