package com.sample.blog.jpa_equals_hashcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnimalRepositoryTest {
    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    EntityManager entityManager;

    @Test
    @Transactional
    void 동일_객체_test() {
        Animal animal = new Animal("호랑이", 3);
        animal = animalRepository.save(animal);
        entityManager.clear();

        Animal findAnimal = animalRepository.findById(animal.getId()).orElseThrow(
                () -> new RuntimeException("찾을 수 없습니다.")
        );

        System.out.println("저장한 호랑이 = " + animal);
        System.out.println("꺼낸 호랑이 = " + findAnimal);

        System.out.println("==============================================");

        System.out.println("객체 동일성 검사 = " + animal.equals(findAnimal));

        assertThat(animal.equals(findAnimal)).isTrue();
    }
}



