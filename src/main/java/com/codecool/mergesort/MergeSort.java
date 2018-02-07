package com.codecool.mergesort;

import java.util.List;

public class MergeSort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */
    public void sort(List<Integer> toSort) throws IllegalArgumentException {
        if (toSort == null) {
            throw new IllegalArgumentException();
        }

        mergeSort(toSort);
    }
}
