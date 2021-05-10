package com.java.bill0cypher.multithread.sequentialcompletion.pool;

public class ThreadPool {
    public static void execute(Thread... threads) throws InterruptedException {
        if (threads != null && threads.length > 0) {
            for (Thread thread : threads) {
                thread.start();
                thread.join();
            }
        }
    }
}

