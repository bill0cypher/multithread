package com.java.bill0cypher.multithread.mergesort;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ParallelMergeSortExample {
    public static void main(String ...args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int[] arr = new int[100_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
        forkJoinPool.invoke(new MergeSortTask(arr, 0, arr.length - 1));
    }
}
