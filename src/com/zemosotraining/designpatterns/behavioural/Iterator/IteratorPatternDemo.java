package com.zemosotraining.designpatterns.behavioural.Iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NamesCollection names = new NamesCollection();

        for(Iterator iter = names.getIterator(); iter.hasNext(); ){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}