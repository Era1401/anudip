package com.anudip.placement_management_system.service;

import com.anudip.placement_management_system.dto.application.ApplicationRequest;
import com.anudip.placement_management_system.dto.application.ApplicationResponse;
import com.anudip.placement_management_system.enums.ApplicationStatus;

import java.util.List;

public interface ApplicationService {

    ApplicationResponse applyForJob(ApplicationRequest request);

    ApplicationResponse getApplicationById(Long id);

    List<ApplicationResponse> getAllApplications();

    List<ApplicationResponse> getApplicationsByStudent(Long studentId);

    List<ApplicationResponse> getApplicationsByJob(Long jobId);

    ApplicationResponse updateApplicationStatus(
            Long id,
            ApplicationStatus status
    );
}