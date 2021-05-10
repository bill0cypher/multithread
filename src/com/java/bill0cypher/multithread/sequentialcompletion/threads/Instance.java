package com.java.bill0cypher.multithread.sequentialcompletion.threads;

public class Instance {
    public static Instance instance;

    private Instance(){}
    public void first() {print("first");}
    public void second() {print("second");}
    public void third() {print("third");}
    private void print(String s)
    {
        System.out.println(s);
    }

    public synchronized static Instance getInstance() {
        if (instance == null)
            instance = new Instance();
        return instance;
    }
}
