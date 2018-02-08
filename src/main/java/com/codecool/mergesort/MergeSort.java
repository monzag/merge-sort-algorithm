package com.codecool.mergesort;

import java.util.List;

public class MergeSort {

    private static final int FIRST_INDEX = 0;
    private static final int INDEX_CORRECTION = 1;
    private static final int BY_TWO = 2;

    private List<Integer> numbers;
    private Integer[] temp;

    public void sort(List<Integer> toSort) throws IllegalArgumentException {
        if (toSort == null) {
            throw new IllegalArgumentException();
        }
        int low = FIRST_INDEX;
        int high = toSort.size() - INDEX_CORRECTION;
        numbers = toSort;
        temp = new Integer[high + INDEX_CORRECTION];
        mergeSort(low, high);
    }

    private void mergeSort(int low, int high) {
        int middle = low + (high - low) / BY_TWO;

        if (low < high) {
            mergeSort(low, middle);
            mergeSort(middle + INDEX_CORRECTION, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int index = low; index <= high; index++) {
            temp[index] = numbers.get(index);
        }

        int i = low;
        int j = middle + INDEX_CORRECTION;
        int k = low;
        while (i <= middle && j <= high) {
            if (temp[i] <= numbers.get(j)) {
                numbers.set(k, temp[i]);
                i++;

            } else {
                numbers.set(k, temp[j]);
                j++;
            }
            k++;
        }
        while (i <= middle) {
            numbers.set(k, temp[i]);
            k++;
            i++;
        }
    }
}
