package com.sg.smc.service;

import java.util.List;

import com.sg.smc.dto.CompanyDto;

public interface CompanyService {
	
	public CompanyDto addCompany(CompanyDto companyDto);
	public CompanyDto updateCompany(CompanyDto companyDto);
	public List<CompanyDto> findAllCompany();
	public CompanyDto findByCompanyId(long companyId);
	public CompanyDto deleteByCompanyId(long companyId);
	public List<CompanyDto> findByCompanyName(String companyName);

}
