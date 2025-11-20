package LibraryManagementSystem.dataaccessor;

import LibraryManagementSystem.book.BookCopy;
import LibraryManagementSystem.user.Member;

import java.awt.print.Book;
import java.util.List;

public class DbAccessor {

    public Results getBooksWithName(String bookName) {

    }
    public Results getBooksWithAuthorsName(List<String> authorNames) {

    }

    public Results getMembersWithName(String memberName) {

    }
    public void insertCopy(BookCopy bookCopy) {

    }

    public void deleteCopy(BookCopy bookCopy) {

    }

    public void markAsBlocked(Member member) {

    }

    public void issueBookCopyToMember(Member member, BookCopy bookCopy) {

    }

    public void submitBookCopyFromMember(Member member, BookCopy bookCopy) {

    }

    public boolean isCopyAvailable(BookCopy bookCopy) {
        return false;
    }

    public Results getBorrowedBooks(Member member) {
        return null;
    }

    public Results getBookBorrower(BookCopy bookCopy) {
        return null;
    }

}
