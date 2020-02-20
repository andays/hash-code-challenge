package main;

import java.util.List;

public class Library {
    int libId;          //id of library.
    List<Book> books;	//set of book.
    int time;			//time takes to complete scan process.
    int booksSendPerDay; //no of books send per day.

    public Library(int id, List<Book> bookList, int time, int booksSendPerDay) {
        libId = id;
        books = bookList;
        this.time = time;
        this.booksSendPerDay = booksSendPerDay;
    }
}
