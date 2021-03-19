package com.zemosotraining.designpatterns.creational.Singleton;

public class SingletonClass {

    private static final SingletonClass singleInstance = new SingletonClass("qwerty"); // Early
    public String value;

    private SingletonClass(String value) {
        this.value = value;
    }

    public static SingletonClass getInstance() {
        return singleInstance;
    }

    public void displayMessage() {
        System.out.println(value + " This is Singleton class! ");
    }
}


class LazySingleton {

    private static LazySingleton instance;
    public String value;

    private LazySingleton(String value) {
        this.value = value;
    }

    public static LazySingleton getInstance(String v) {
        if (instance == null)
            instance = new LazySingleton(v); // Lazy
        return instance;
    }

    public void displayMessage() {
        System.out.println(value + " This is Singleton class! ");
    }
}

class SingletonDemo {
    public static void main(String[] args) {
        //    SingletonClass s = new SingletonClass();
        SingletonClass singleObject = SingletonClass.getInstance();
        singleObject.displayMessage();

        SingletonClass singleObject1 = SingletonClass.getInstance();
        singleObject1.displayMessage();

        //  LazySingleton lazySingleton = new LazySingleton("ghh");
        LazySingleton lazyObject = LazySingleton.getInstance("LazyMe!");
        lazyObject.displayMessage();

        LazySingleton lazyObject1 = LazySingleton.getInstance("mom");
        lazyObject1.displayMessage();

    }
}