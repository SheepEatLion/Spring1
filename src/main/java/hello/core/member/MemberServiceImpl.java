package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // 회원 서비스를 실행하기 위해 구현체가 필요한데, 그냥 인터페이스만 가져오면 널포인트익센션 나니까 만들어둔 메모리 구현체 가져옴.
    private final MemberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
