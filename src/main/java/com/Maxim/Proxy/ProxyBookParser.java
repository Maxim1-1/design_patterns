package com.Maxim.Proxy;

public class ProxyBookParser implements BookParser {

    private String book;
    private BookParserImpl bookParser;

    ProxyBookParser (String book) {
        this.book=book;
    }

    @Override
    public int getNumWords() {

        if (bookParser==null){
            bookParser = new BookParserImpl(book);
        }
        return bookParser.getNumWords();
    }
}
