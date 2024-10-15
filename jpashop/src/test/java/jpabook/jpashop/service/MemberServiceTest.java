package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void 회원가입() {
        // given
        Member member = new Member();
        member.setName("jae hyeok seong");

        // when
        Long saveId = memberService.join(member);

        // then
        assertThat(memberService.findOne(saveId))
                .isSameAs(member);
    }

    @Test
    void 중복회원_예외() {
        // given
        Member member1 = new Member();
        member1.setName("jae");

        Member member2 = new Member();
        member2.setName("jae");

        // when
        memberService.join(member1);

        // then
        assertThatThrownBy(() -> memberService.join(member2))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("이미 존재하는 회원 입니다.");
    }
}