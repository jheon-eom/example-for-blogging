package com.sample.blog.transactionaldup;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.PreDestroy;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    void save() {
        Member preMember = new Member();
        preMember.setId(1L);
        preMember.setName("memberA");
        memberRepository.save(preMember);
    }

    @Test
    void update() {
        save();

        MemberDto updateMember = new MemberDto();
        updateMember.setId(1L);
        updateMember.setName("memberB");
        Member member = memberService.modifyMemberName(updateMember);

        System.out.println("멤버 이름 수정 후 = " + member.getName());
        assertThat(member.getName()).isEqualTo("memberB");
    }
}