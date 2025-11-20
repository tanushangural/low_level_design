package LibraryManagementSystem.searcher;

import LibraryManagementSystem.book.BookCopy;

import java.util.List;

public class AuthorBasedBookSearcher implements BookSearcher{

    private final List<String> authoerName;

    public AuthorBasedBookSearcher(List<String> authoerName) {
        this.authoerName = authoerName;
    }

    @Override
    public List<BookCopy> search() {
        return null;
    }
}
