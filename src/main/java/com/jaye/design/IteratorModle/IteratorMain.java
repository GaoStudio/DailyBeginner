package com.jaye.design.IteratorModle;

public class IteratorMain {


    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("图解Http"));
        bookShelf.appendBook(new Book("Java编程思想"));
        bookShelf.appendBook(new Book("Android源码解析"));
        Iterator it = bookShelf.itreater();
        while (it.hasnext()){
            System.out.println(it.next().getName());
        }
    }
}
