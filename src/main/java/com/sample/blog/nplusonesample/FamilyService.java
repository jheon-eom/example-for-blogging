package com.sample.blog.nplusonesample;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class FamilyService {
    private final ParentRepository parentRepository;
    private final ChildRepository childRepository;

    public FamilyService(ParentRepository parentRepository, ChildRepository childRepository) {
        this.parentRepository = parentRepository;
        this.childRepository = childRepository;
    }

    // 부모와 자식을 등록하는 메서드

    // 부모의 자식을 조회하는 메서드
}
