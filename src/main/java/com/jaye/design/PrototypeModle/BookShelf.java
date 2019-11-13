package com.jaye.design.PrototypeModle;

import java.io.*;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 09:40
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class BookShelf implements Cloneable, Serializable {
    private String name;
    private Book book;
    private BookTitle bookTitle;

    public BookTitle getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(BookTitle bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected BookShelf clone() {

        try {
            return (BookShelf) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public BookShelf deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream ObjectInputStream = new ObjectOutputStream(bao);
        ObjectInputStream.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (BookShelf) ois.readObject();

    }
}
