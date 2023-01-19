package com.school.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.management.entity.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long> {

}
