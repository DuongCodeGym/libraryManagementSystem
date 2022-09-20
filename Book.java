public class Book {
    private String bookID;
    private String title;
    private String publisher;
    private int year;

    public Book(String bookID, String title, String publisher, int year) {
        this.bookID = bookID;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String getBookID() {
        return bookID;
    }

    private void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return this.bookID+"-"+this.title +"-"+this.publisher+"-"+this.year;
    }
}
