package com.jaye.design.PrototypeModle;

import java.io.IOException;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 09:38
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class PrototypeMain {
    public static void main(String[] args) {
        BookShelf bookShelf1 = new BookShelf();
        bookShelf1.setName("1号柜");
        Book book1 = new Book();
        book1.setName("哈利波特");
        bookShelf1.setBook(book1);
        BookTitle bookTitle1 = new BookTitle();
        bookTitle1.setTitle("魔幻");
        bookShelf1.setBookTitle(bookTitle1);

        BookShelf bookShelf2 = bookShelf1.clone();
        BookShelf bookShelf3 = null;
        try {
            bookShelf3 = bookShelf1.deepClone();
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("克隆失败"+e.getMessage());
        }
        System.out.println(bookShelf2 == bookShelf1);
        System.out.println(bookShelf3 == bookShelf1);

        System.out.println(bookShelf2.getBook() == bookShelf1.getBook());
        System.out.println(bookShelf3.getBook() == bookShelf1.getBook());
        System.out.println(bookShelf2.getBookTitle() == bookShelf1.getBookTitle());
        System.out.println(bookShelf2.getName() == bookShelf1.getName());

    }
}
