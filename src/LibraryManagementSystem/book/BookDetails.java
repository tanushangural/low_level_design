package LibraryManagementSystem.book;

import java.util.Date;
import java.util.List;

public class BookDetails {
    private final String bookName;
    private final Date publicationDate;
    private final List<String> authorNames;

    public BookDetails(String bookName, Date publicationDate, List<String> authorNames) {
        this.bookName = bookName;
        this.publicationDate = publicationDate;
        this.authorNames = authorNames;
    }
}
