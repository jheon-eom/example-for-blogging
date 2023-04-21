package com.sample.blog.nplusonesample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface ParentRepository extends JpaRepository<Parent, Long> {

    @Query("select p from Parent p join fetch p.children where p.id = :id")
    public List<Parent> findAllById(@Param("id") Long id);
}
