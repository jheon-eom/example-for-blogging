package com.sample.blog.transactionaldup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Member modifyMemberName(MemberDto updateMember) {
        Optional<Member> member = memberRepository.findMemberByIdAndDeleteYn(
                updateMember.getId(), updateMember.getDeleteYn());
        Member findMember = member.orElseThrow(() -> new RuntimeException("조회된 회원이 없습니다."));
        System.out.println("멤버 이름 수정 전 = " + findMember.getName());
        findMember.setName(updateMember.getName());
        return findMember;
    }
}
