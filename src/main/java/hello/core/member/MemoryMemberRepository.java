package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
// DB가 확정되지 않았기 때문에 메모리레포지토리를 인터페이스로 생성한 것.
@Component
public class MemoryMemberRepository implements MemberRepository {
// 해시맵은 동시성 이슈가 발생할 수 있어서 컨커런트해쉬를 써야하지만 예제임으로 생략
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
