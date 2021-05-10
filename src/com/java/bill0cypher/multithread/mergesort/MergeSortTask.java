package com.java.bill0cypher.multithread.mergesort;

import java.util.concurrent.RecursiveAction;

class MergeSortTask extends RecursiveAction {
    private int[] arr;
    private int bottom, high;

    public MergeSortTask(int[] arr, int bottom, int high) {
        this.arr = arr;
        this.bottom = bottom;
        this.high = high;
    }

    @Override
    protected void compute() {
        if (bottom == high) {
            return;
        } else {
            int mid = (bottom + high) / 2;
            invokeAll(
                    new MergeSortTask(arr, bottom, mid),
                    new MergeSortTask(arr, mid + 1, high)
            );
            merge(arr, bottom, ((bottom + high) / 2) + 1, high);
        }
    }

    private void merge(int[] arr, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;
        while (lowPtr <= mid && highPtr <= upperBound)
            if (this.arr[lowPtr] < this.arr[highPtr])
                arr[j++] = this.arr[lowPtr++];
            else
                arr[j++] = this.arr[highPtr++];
        while (lowPtr <= mid) arr[j++] = this.arr[lowPtr++];
        while (highPtr <= upperBound) arr[j++] = this.arr[highPtr++];
        for (j = 0; j < n; j++) this.arr[lowerBound + j] = arr[j];
    }
}

