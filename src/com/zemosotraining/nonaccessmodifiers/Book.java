package com.zemosotraining.nonaccessmodifiers;

public abstract class Book {
    int pages;
    String author;

    Book(int p, String a) {
        this.pages = p;
        this.author = a;
    }

    public abstract int getPagesCount();

    public void getAuthorName() {
        System.out.println(author);
    }
}
