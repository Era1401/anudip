package com.anudip.placement_management_system.repository;

import com.anudip.placement_management_system.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {

}
