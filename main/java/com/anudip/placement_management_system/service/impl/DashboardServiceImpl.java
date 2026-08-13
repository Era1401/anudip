package com.anudip.placement_management_system.service.impl;

import com.anudip.placement_management_system.dto.dashboard.DashboardResponse;
import com.anudip.placement_management_system.repository.*;
import com.anudip.placement_management_system.service.DashboardService;
import org.springframework.stereotype.Service;

import com.anudip.placement_management_system.repository.StudentRepository;
import com.anudip.placement_management_system.repository.CompanyRepository;
import com.anudip.placement_management_system.repository.JobRepository;
import com.anudip.placement_management_system.repository.ApplicationRepository;

@Service
public class DashboardServiceImpl implements DashboardService {

    private final StudentRepository studentRepository;
    private final CompanyRepository companyRepository;
    private final JobRepository jobRepository;
    private final ApplicationRepository applicationRepository;
    private final PlacementRepository placementRepository;

    @Override
    public DashboardResponse getDashboardStatistics() {

        // calculate statistics

        return dashboardResponse;
    }
}
