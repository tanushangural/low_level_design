package LibraryManagementSystem.searcher;

import LibraryManagementSystem.book.BookCopy;

import java.util.List;

public interface BookSearcher {
    List<BookCopy> search();
}
