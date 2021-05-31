package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {
    // 회원 서비스를 실행하기 위해 구현체가 필요한데, 그냥 인터페이스만 가져오면 널포인트익센션 나니까 만들어둔 메모리 구현체 가져옴.
    //private final MemberRepository memberRepository = new MemoryMemberRepository();

    private final MemberRepository memberRepository;

    @Autowired //ac.getBean(MemberRepository.class) 와 같음.
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // @Configuration 관련 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
