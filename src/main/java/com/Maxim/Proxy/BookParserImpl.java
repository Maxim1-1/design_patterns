package com.Maxim.Proxy;

public class BookParserImpl implements BookParser{

    private String book;

    BookParserImpl (String book) {
        this.book=book;
    }
    @Override
    public int getNumWords() {
        return book.length();
    }

}
