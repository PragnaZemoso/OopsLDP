package com.zemosotraining.nonaccessmodifiers;

public class AbstractDemo extends Book {

    AbstractDemo(int p, String a) {
        super(p, a);
    }

    @Override
    public int getPagesCount() {
        return pages;
    }

    @Override
    public void getAuthorName() {
        System.out.println("Author of the book: " + author );
    }
    public static void main(String[] args) {
        AbstractDemo demoObj = new AbstractDemo(100, "Anand");
        int pageCount = demoObj.getPagesCount();
        System.out.println("No. of pages in the Book: " + pageCount);
        demoObj.getAuthorName();
    }
}
