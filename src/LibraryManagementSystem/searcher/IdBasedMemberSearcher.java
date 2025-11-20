package LibraryManagementSystem.searcher;

import LibraryManagementSystem.user.Member;

import java.util.List;

public class IdBasedMemberSearcher implements MemberSearcher {

    private final String memberId;

    public IdBasedMemberSearcher(String memberId) {
        this.memberId = memberId;
    }
    @Override
    public List<Member> search() {
        return null;
    }
}
