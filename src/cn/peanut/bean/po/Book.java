package cn.peanut.bean.po;

public class Book {
    private Integer bookId;

    private String bookName;

    private String bookAuthor;

    private String bookStatus;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
    public String getBookStatus() {
        return bookStatus;
    }
}