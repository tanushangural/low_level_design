package LibraryManagementSystem.searcher;

import LibraryManagementSystem.book.BookCopy;

import java.util.List;

public class IdBasedBookSearcher implements BookSearcher{

    private final String bookCopyId;

    public IdBasedBookSearcher(String bookCopyId) {
        this.bookCopyId = bookCopyId;
    }
    @Override
    public List<BookCopy> search() {
        return null;
    }
}
