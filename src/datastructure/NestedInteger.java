package datastructure;

import java.util.List;

public interface NestedInteger {
    // Return true if this NestedInteger holds a single integer, rather than a nested list.
    boolean isInteger();

    // Return the single integer that this NestedInteger holds, if it holds a single integer.
    // Return null if this NestedInteger holds a nested list.
    Integer getInteger();

    // Return the nested list that this NestedInteger holds, if it holds a nested list.
    // Return null if this NestedInteger holds a single integer.
    List<NestedInteger> getList();
}
