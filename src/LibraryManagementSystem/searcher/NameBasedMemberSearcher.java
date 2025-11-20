package LibraryManagementSystem.searcher;

import LibraryManagementSystem.dataaccessor.DbAccessor;
import LibraryManagementSystem.dataaccessor.ResultConverter;
import LibraryManagementSystem.dataaccessor.Results;
import LibraryManagementSystem.user.Member;

import java.util.List;

public class NameBasedMemberSearcher implements MemberSearcher{

    private final String memberName;
    private final DbAccessor dbAccessor;

    public NameBasedMemberSearcher(String memberName) {
        this.memberName = memberName;
        dbAccessor = new DbAccessor();
    }
    @Override
    public List<Member> search() {
        Results results = dbAccessor.getMembersWithName(memberName);
        return ResultConverter.convertToMembers(results);
    }
}
