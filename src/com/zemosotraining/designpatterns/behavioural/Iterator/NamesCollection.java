package com.zemosotraining.designpatterns.behavioural.Iterator;

public class NamesCollection implements Container {

    public String names[] = {"Pragna", "Sonu", "Rishi", "Rahul", "Hemanth"};

    @Override
    public Iterator getIterator() {
        return new NamesCollectionIterate();
    }

    private class NamesCollectionIterate implements Iterator {

        int i;
        @Override
        public boolean hasNext() {
            if (i < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[i++];
            }
            return null;
        }
    }
}
