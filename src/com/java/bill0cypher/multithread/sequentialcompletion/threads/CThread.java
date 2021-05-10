package com.java.bill0cypher.multithread.sequentialcompletion.threads;


public class CThread extends Thread{
    @Override
    public void run() {
        Instance.getInstance().third();
    }
}
