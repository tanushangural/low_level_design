package LibraryManagementSystem.book;

public class BookCopy {
    private String id;

    //prefer composition over inheritence for bookdetails
    private final BookDetails bookDetails;


    public BookCopy(BookDetails bookDetails, String id) {
        this.bookDetails = bookDetails;
        this.id = id;
    }

}
