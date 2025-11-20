package LibraryManagementSystem;

import LibraryManagementSystem.BookInventory.BookInventory;
import LibraryManagementSystem.IdGenerator.IDGenerator;
import LibraryManagementSystem.book.BookCopy;
import LibraryManagementSystem.book.BookDetails;
import LibraryManagementSystem.auth.UserAuthenticator;
import LibraryManagementSystem.dataaccessor.DbAccessor;
import LibraryManagementSystem.searcher.*;
import LibraryManagementSystem.user.Member;

import java.util.Date;
import java.util.List;

public class Main {

    private final BookInventory bookInventory = new BookInventory(new DbAccessor());

    public List<BookCopy> searchBookByBookName(String bookName) {
        // validate Params
        if(bookName.isEmpty() || bookName == null) {
            throw new IllegalArgumentException("Book name can't be null or empty");
        }
        // new keyword can be avoid here using factory design pattern
        BookSearcher bookSearcher = new NameBasedBookSearcher(bookName);
        return bookSearcher.search();
    }

    public List<BookCopy> searchBookByAuthorName(List<String> authors) {
        // validate Params
        if(authors.isEmpty() || authors == null) {
            throw new IllegalArgumentException("AuthorNames can't be null or empty");
        }
        BookSearcher bookSearcher = new AuthorBasedBookSearcher(authors);
        return bookSearcher.search();
    }

    public List<Member> searchMembersByMemberName(String memberName, String token) throws IllegalAccessException {
        // authenticate if this token is of admin
        if(!UserAuthenticator.isAdmin(token)) {
            return new IllegalAccessException("Authentication forbidden");
        }

        MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName);
        return memberSearcher.search();
    }

    public void addBookCopy(String bookName, List<String> authors, Date publicationDate, String token) {
        if(!UserAuthenticator.isAdmin(token)) {
            return new IllegalAccessException("Authentication forbidden");
        }

        BookDetails bookDetails = new BookDetails(bookName, authors, publicationDate);
        BookCopy bookCopy = new BookCopy(bookDetails, IDGenerator.getUniqueId());
        bookInventory.addBookCopy(bookCopy);
    }

    public void removeBookCopy(String bookCopyId, String token) {
        // params validations checks


        if(!UserAuthenticator.isAdmin(token)) {
            return new IllegalAccessException("Authentication forbidden");
        }
        List<BookCopy> bookCopies = new IdBasedBookSearcher(bookCopyId).search();
        if(bookCopies.isEmpty() || bookCopies == null) {
            return new RuntimeException("No book copies retrieved for given id");
        }
        bookInventory.deleteBookCopy(bookCopies.get(0));

    }

    public void issueBookCopy(String memberId, String bookCopyId, String token) {
        // params validation
        // auth

        List<BookCopy> bookCopies = new IdBasedBookSearcher(bookCopyId).search();
        List<Member> members = new IdBasedMemberSearcher(memberId).search();

        // perform null checks for bookcopies and memebers

        bookInventory.issueBook(members.get(0), bookCopies.get(0));
    }

    public void submitBookCopy(String memberId, String bookCopyId, String token) {
        // params validation
        // auth

        List<BookCopy> bookCopies = new IdBasedBookSearcher(bookCopyId).search();
        List<Member> members = new IdBasedMemberSearcher(memberId).search();

        // perform null checks for bookcopies and memebers

        bookInventory.submitBook(members.get(0), bookCopies.get(0));
    }

    public void blockMember(String memberId, String token) {
        if(Integer.parseInt(memberId) < 0 || token != null && token.length() == 0) {

        }
        if(!UserAuthenticator.isAdmin(token)) {
            return new IllegalAccessException("Authentication forbidden");
        }
        List<Member> members = new IdBasedMemberSearcher(memberId).search();
        if(members == null || members.isEmpty()) {
            return new RuntimeException("No member reteiver for memberID");
        }
        bookInventory.blockMember(members.get(0));

    }

    public boolean checkBookAvailability(String bookCopyId) {

    }

    public IssueStatus statusCheckofBookCopyIssued(String bookCopyId) {

    }

    public Member getBorrowerOfBook(String bookCopyId, String token) {

    }

    public List<BookCopy> getBookByBorrowedByMember(String memberId) {

    }
    public static void main(String[] args) {


    }
}
