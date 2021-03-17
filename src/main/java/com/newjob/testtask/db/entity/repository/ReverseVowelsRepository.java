package com.newjob.testtask.db.entity.repository;

import com.newjob.testtask.db.entity.ReverseVowels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReverseVowelsRepository extends JpaRepository<ReverseVowels, Integer> {
}
