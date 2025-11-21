package DesignPatterns.Strategy;

import DesignPatterns.Strategy.inserter.Inserter;
import DesignPatterns.Strategy.searcher.Searcher;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
    private final List<Integer> nums;
    private final Inserter insertStrategy;
    private final Searcher searchStrategy;

    public NumberStore(Inserter insertStrategy, Searcher searchStrategy) {
        this.nums = new ArrayList<>();
        this.insertStrategy = insertStrategy;
        this.searchStrategy = searchStrategy;
    }

    public void insert(Integer number) {
        insertStrategy.insert(number, nums);
    }

    public Integer search(Integer number) {
        return searchStrategy.search(number, nums);
    }

}

/*
* 1. Not following Open close principle
* 2. Class will keep increase as new algorithm keep introducing
* 3. Code is not readable
* */
