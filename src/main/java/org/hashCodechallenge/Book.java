package main.java.org.hashCodechallenge;

public class Book {
    int bookId;			//id of book.
    int bookScore;		//score of book.

    public Book(int id, int score) {
        bookId = id;
        bookScore = score;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookScore() {
        return bookScore;
    }

    public void setBookScore(int bookScore) {
        this.bookScore = bookScore;
    }
}
