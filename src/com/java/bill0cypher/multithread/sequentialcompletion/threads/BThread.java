package com.java.bill0cypher.multithread.sequentialcompletion.threads;


public class BThread extends Thread{
    @Override
    public void run() {
        Instance.getInstance().second();
    }
}
