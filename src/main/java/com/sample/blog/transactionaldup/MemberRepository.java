package com.sample.blog.transactionaldup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Transactional(readOnly = true)
    @Query(value = "select m from Member m where m.id = :id and m.deleteYn = :deleteYn")
    Optional<Member> findMemberByIdAndDeleteYn(@Param("id") Long id, @Param("deleteYn") String deleteYn);
}
