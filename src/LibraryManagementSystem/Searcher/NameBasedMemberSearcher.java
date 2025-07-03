package LibraryManagementSystem.Searcher;

public class NameBasedMemberSearcher implements MemberSearcher{

    private final String memberName;

    public NameBasedMemberSearcher(String memberName) {
        this.memberName = memberName;
    }

//    @Override
//    public List<Member> search() {
//        return null;
//    }
}
