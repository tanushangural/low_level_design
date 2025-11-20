package LibraryManagementSystem.searcher;

import LibraryManagementSystem.book.BookCopy;
import LibraryManagementSystem.dataaccessor.DbAccessor;
import LibraryManagementSystem.dataaccessor.ResultConverter;
import LibraryManagementSystem.dataaccessor.Results;

import java.util.List;

public class NameBasedBookSearcher implements BookSearcher {

    private final String bookName;

    private final DbAccessor dbAccessor;

    public NameBasedBookSearcher(String bookName) {
        this.bookName = bookName;
        this.dbAccessor = new DbAccessor();
    }

    @Override
    public List<BookCopy> search() {
        Results results = dbAccessor.getBooksWithName(bookName);
        return ResultConverter.convertToBookCopies(results);
    }
}
