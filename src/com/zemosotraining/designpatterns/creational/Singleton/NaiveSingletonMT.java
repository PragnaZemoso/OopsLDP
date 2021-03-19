package com.zemosotraining.designpatterns.creational.Singleton;

// Multithreaded env - multiple threads can call creation method simultaneously & get multiple instances
public class NaiveSingletonMT {
    private static NaiveSingletonMT instance;
    public String value;

    private NaiveSingletonMT(String v) {
        this.value = v;
    }

    public static NaiveSingletonMT getInstance(String value) {
        if (instance == null)
            instance = new NaiveSingletonMT(value);
        return instance;
    }
}

class NaiveSingletonMTDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());

        thread1.start();
        thread2.start();
    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {
            NaiveSingletonMT singleInstance = NaiveSingletonMT.getInstance("XYZ");
            System.out.println(singleInstance.hashCode() + " & Value: " + singleInstance.value);
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            NaiveSingletonMT singleInstance = NaiveSingletonMT.getInstance("ABC");
            System.out.println(singleInstance.hashCode() + " & Value: " + singleInstance.value);
        }
    }
}