package LibraryManagementSystem.book;

public class BookCopy {

    private final BookDetails bookDetails;
    private final Integer bookId;

    public BookCopy(BookDetails bookDetails, Integer bookId) {
        this.bookDetails = bookDetails;
        this.bookId = bookId;
    }
}
