package com.sg.smc.utilities;

import java.util.ArrayList;
import java.util.List;

import com.sg.smc.bean.Company;
import com.sg.smc.dto.CompanyDto;

public class CompanyUtilities {

	public static CompanyDto convertToCompanyDto(Company company) {

		CompanyDto companyDto = new CompanyDto();

		companyDto.setCompanyId(company.getCompanyId());
		companyDto.setCompanyName(company.getCompanyName());
		companyDto.setTurnover(company.getTurnover());
		companyDto.setCeo(company.getCeo());
		companyDto.setBoardOfDirectors(company.getBoardOfDirectors());
		companyDto.setStockExchanges(company.getStockExchanges());
		companyDto.setSector(company.getSector());
		companyDto.setDescription(company.getDescription());
		companyDto.setStockCodes(company.getStockCodes());
		return companyDto;
	}

	public static Company convertToCompany(CompanyDto companyDto) {

		Company company = new Company();

		company.setCompanyId(companyDto.getCompanyId());
		company.setCompanyName(companyDto.getCompanyName());
		company.setTurnover(companyDto.getTurnover());
		company.setCeo(companyDto.getCeo());
		company.setBoardOfDirectors(companyDto.getBoardOfDirectors());
		company.setStockExchanges(companyDto.getStockExchanges());
		company.setSector(companyDto.getSector());
		company.setDescription(companyDto.getDescription());
		company.setStockCodes(companyDto.getStockCodes());
		return company;

	}

	public static List<CompanyDto> convertToCompanyDtoList(List<Company> list) {
		List<CompanyDto> dtolist = new ArrayList<CompanyDto>();
		for (Company company : list)
			dtolist.add(convertToCompanyDto(company));
		return dtolist;
	}

}
