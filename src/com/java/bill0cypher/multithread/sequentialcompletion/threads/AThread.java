package com.java.bill0cypher.multithread.sequentialcompletion.threads;


public class AThread extends Thread{

    @Override
    public void run() {
        Instance.getInstance().first();
    }
}
