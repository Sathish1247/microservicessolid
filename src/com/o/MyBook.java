package com.o;

public class MyBook implements BookInterface {
    private String author;

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public void setAuthor(String name) {
        this.author = name;
    }
}
