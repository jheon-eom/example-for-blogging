package com.sample.blog.nplusonesample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FamilyServiceTest {
    @Autowired
    ParentRepository parentRepository;
    @Autowired
    ChildRepository childRepository;
    @Autowired
    EntityManager em;

    @Test
    @DisplayName("object not null test")
    public void objectNullTest() {
        Assertions.assertThat(parentRepository).isNotNull();
        Assertions.assertThat(childRepository).isNotNull();
        Assertions.assertThat(em).isNotNull();
    }

    @Test
    @DisplayName("create family test")
    @Transactional
    public void createFamilyTest() {
        Parent parent = new Parent("kimkk", 30);
        Child child1 = new Child("kimaa", 10);
        Child child2 = new Child("kimabb", 11);
        Child child3 = new Child("kimacc", 7);

        // 자식을 호적에 등록한다.
        parent.addChild(child1);
        parent.addChild(child2);
        parent.addChild(child3);

        // 부모와 자식을 각각 디비 테이블에 저장
        // insert 쿼리 나갈 것
        parentRepository.save(parent);
        childRepository.save(child1);
        childRepository.save(child2);
        childRepository.save(child3);

        System.out.println("============부모, 자식 저장============");
        em.flush();
        em.clear();

        // 부모 조회
        // select 쿼리 나갈 것
        // 지연로딩이므로 자식은 조인하지 않음
        System.out.println("============부모 조회=============");
        List<Parent> parents = parentRepository.findAllById(1L); // 무조건 존재하므로 get() 메서드 사용
        System.out.println("inner fetch join 데이터 조회 건수 = " + parents.size());
    }
}