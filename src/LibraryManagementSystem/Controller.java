package LibraryManagementSystem;

import LibraryManagementSystem.Auth.UserAuthenicator;
import LibraryManagementSystem.Searcher.*;
import LibraryManagementSystem.book.BookCopy;

import java.util.List;

public class Controller {
    public List<BookCopy> searchBookByBookName (String bookName) {
        if (bookName == null) {
            throw new IllegalArgumentException("BookName can't be null");
        }
        BookSearcher bookSearcher = new NameBasedBookSearcher(bookName);
        return bookSearcher.search();
    }

    public List<BookCopy> searchBookByAuthorName (String authorName) {
        if (authorName == null) {
            throw new IllegalArgumentException("AuthorName can't be null");
        }
        BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorName);
        return bookSearcher.search();
    }

//    public List<Member> searchMemberByMemberName (String memberName, String adminToken) {
//
//        // auth
//        if(UserAuthenicator.isAdminToken(adminToken)) {
//            throw new IllegalArgumentException("Invalid Admin Token");
//        }
//
//        if (memberName == null) {
//            throw new IllegalArgumentException("MemberName can't be null");
//        }
//        MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName);
//        return memberSearcher.search();
//    }

}
