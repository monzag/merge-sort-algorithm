package com.codecool.mergesort;

import java.util.List;

public class MergeSort {

    private List<Integer> numbers;
    private Integer[] temp;

    public void sort(List<Integer> toSort) throws IllegalArgumentException {
        if (toSort == null) {
            throw new IllegalArgumentException();
        }
        int low = 0;
        int high = toSort.size() - 1;
        numbers = toSort;
        temp = new Integer[high + 1];
        mergeSort(low, high);
    }

    private void mergeSort(int low, int high) {
        int middle = low + (high - low) / 2;

        if (low < high) {
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }


}
