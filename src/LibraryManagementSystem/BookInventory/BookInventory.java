package LibraryManagementSystem.BookInventory;

import LibraryManagementSystem.book.BookCopy;
import LibraryManagementSystem.dataaccessor.DbAccessor;
import LibraryManagementSystem.dataaccessor.ResultConverter;
import LibraryManagementSystem.dataaccessor.Results;
import LibraryManagementSystem.user.Member;

import java.util.List;

public class BookInventory {

    private final DbAccessor dbAccessor;

    public BookInventory(DbAccessor dbAccessor) {
        this.dbAccessor = dbAccessor;
    }

    public void addBookCopy(BookCopy bookCopy) {
        if(bookCopy == null) {
            // ..
        }
        dbAccessor.insertCopy(bookCopy);

    }

    public void deleteBookCopy(BookCopy bookCopy) {
        if(bookCopy == null) {
            // ..
        }
        /*
        1. check if copy is available
        * */
        dbAccessor.deleteCopy(bookCopy);
    }

    public void blockMember(Member member) {

    }

    public void issueBook(Member member, BookCopy bookCopy) {

    }

    public void submitBook(Member member, BookCopy bookCopy) {

    }

    public Member getBookBorrower(BookCopy bookCopy) {
        Results results = dbAccessor.getBookBorrower(bookCopy);
        return ResultConverter.convertToMember(results);
    }

    public List<BookCopy> getBorrowedBooks(Member member) {
        Results results = dbAccessor.getBorrowedBooks(member);
        return ResultConverter.convertToBookCopies(results);
    }
}
