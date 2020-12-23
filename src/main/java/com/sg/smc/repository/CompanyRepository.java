package com.sg.smc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.smc.bean.Company;
import com.sg.smc.dto.CompanyDto;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

	List<CompanyDto> findByCompanyName(String companyName);

}
