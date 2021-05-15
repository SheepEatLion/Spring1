package hello.core.member;

// 회원 가입과 회원 조회 기능이 담긴 회원서비스의 인터페이스
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
