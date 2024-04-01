package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.JobTitle;


@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
