package LibraryManagementSystem.book;

import java.util.Date;
import java.util.List;

public class BookDetails {
    private String bookName;
    private List<String> authorsName;
    private Date publicationDate;

    public BookDetails(String bookName, List<String> authorsName, Date publicationDate) {
        this.authorsName = authorsName;
        this.bookName = bookName;
        this.authorsName = authorsName;
    }
}
