package com.zemosotraining.designpatterns.creational.Singleton;

// Multithreaded env - multiple threads can call creation method simultaneously & get single instance
// as first instance creation makes the threads synchronized
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    public String value;

    private ThreadSafeSingleton(String v) {
        this.value = v;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        ThreadSafeSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null)
                instance = new ThreadSafeSingleton(value);
            return instance;
        }
    }

}

class ThreadSafeSingletonDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());

        thread1.start();
        thread2.start();
    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {
            ThreadSafeSingleton singleInstance = ThreadSafeSingleton.getInstance("XYZ");
            System.out.println(singleInstance.hashCode() + " & Value: " + singleInstance.value);
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            ThreadSafeSingleton singleInstance = ThreadSafeSingleton.getInstance("ABC");
            System.out.println(singleInstance.hashCode() + " & Value: " + singleInstance.value);
        }
    }

}