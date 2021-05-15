package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    // psvm 약자ㅋㅋ
    public static void main(String[] args) {
        // 순수 자바로만 설계된 코드.
        // 매번 메인 메서드로 테스트할 순 없으니 당연히 좋은 코드가 아니다. 그래서 Junit이라는 테스트 프레임워크를 사용할 것이다.
        // 멤버서비스 인터페이스를 객체화하고 멤버를 생성한 뒤 join 기능을 시도한다.
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP); // Long 타입이라서 L을 붙여줘야함.
        memberService.join(member);
        // 멤버서비스에서 조회 기능으로 id값을 주고 찾은 뒤에 새로운 멤버와 같은지 확인.
        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
