package com.sg.smc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.smc.dto.CompanyDto;
import com.sg.smc.repository.CompanyRepository;
import com.sg.smc.utilities.CompanyUtilities;


@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepo;
	@Override
	public CompanyDto addCompany(CompanyDto companyDto) {
		
		return CompanyUtilities.convertToCompanyDto(companyRepo.save(CompanyUtilities.convertToCompany(companyDto)));
	}

	@Override
	public CompanyDto updateCompany(CompanyDto companyDto) {
		
		return CompanyUtilities.convertToCompanyDto(companyRepo.save(CompanyUtilities.convertToCompany(companyDto)));
	}

	@Override
	public List<CompanyDto> findAllCompany() {
		
		return CompanyUtilities.convertToCompanyDtoList(companyRepo.findAll());
	}

	@Override
	public CompanyDto findByCompanyId(long companyId) {
		
		return CompanyUtilities.convertToCompanyDto(companyRepo.findById(companyId).orElse(null));
	}

	@Override
	public CompanyDto deleteByCompanyId(long companyId) {
		CompanyDto companyDto = findByCompanyId(companyId);
		companyRepo.deleteById(companyId);
		return companyDto;
	}

	@Override
	public List<CompanyDto> findByCompanyName(String companyName) {
		List<CompanyDto> companies=companyRepo.findByCompanyName(companyName);
		return null;
	}

}
