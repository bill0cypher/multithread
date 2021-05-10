package com.java.bill0cypher.multithread.sequentialcompletion;

import com.java.bill0cypher.multithread.sequentialcompletion.pool.ThreadPool;
import com.java.bill0cypher.multithread.sequentialcompletion.threads.AThread;
import com.java.bill0cypher.multithread.sequentialcompletion.threads.BThread;
import com.java.bill0cypher.multithread.sequentialcompletion.threads.CThread;


public class Launch {
    public static void main(String ...args) {
        try {
            ThreadPool.execute(new AThread(), new BThread(), new CThread());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

