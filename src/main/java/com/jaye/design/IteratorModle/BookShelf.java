package com.jaye.design.IteratorModle;

public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxSize){
        books = new Book[maxSize];

    }
    public Book getBookAt(int i){
        return books[i];
    }
    public void appendBook(Book book){
        if(this.books.length!=last){
            books[last] = book;
            last ++;
        }
    }
    public int getLength(){
        return this.last;
    }
    @Override
    public Iterator itreater() {
        return new BookShelfIterator(this);
    }
}
