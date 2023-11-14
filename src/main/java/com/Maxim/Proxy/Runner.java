package com.Maxim.Proxy;

public class Runner {
    public static void main(String[] args) {
        ProxyBookParser bookParser = new ProxyBookParser("test");

        System.out.print(bookParser.getNumWords());
    }
}
