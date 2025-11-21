package lowLevelDesign.LibraryManagementSystem.DesignPatterns.Strategy.searcher;

import java.util.List;

public interface Searcher {
    Integer search(Integer key, List<Integer> numberList);
}
