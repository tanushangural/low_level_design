package lowLevelDesign.LibraryManagementSystem.DesignPatterns.Strategy;

import lowLevelDesign.LibraryManagementSystem.DesignPatterns.Strategy.inserter.OrderedInserter;
import lowLevelDesign.LibraryManagementSystem.DesignPatterns.Strategy.searcher.BinarySearcher;

public class Tester {
    public static void main(String[] args) {
        NumberStore numberStore = new NumberStore(new OrderedInserter(), new BinarySearcher());
        numberStore.insert(1);
        numberStore.insert(45);
        numberStore.insert(23);
        numberStore.insert(59);
        System.out.println(numberStore.search(59));
    }
}
