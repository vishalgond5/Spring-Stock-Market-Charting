package com.sg.smc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.smc.dto.IpoDetailDto;
import com.sg.smc.repository.IpoDetailRepository;
import com.sg.smc.utilities.IpoDetailUtilities;

@Service
@Transactional
public class IpoDetailServiceImpl implements IpoDetailService {
	
	@Autowired
	private IpoDetailRepository ipoDetailRepo;
	
	@Override
	public IpoDetailDto addIpoDetail(IpoDetailDto ipoDetailDto) {
		
		return IpoDetailUtilities.convertToIpoDetailDto(ipoDetailRepo.save(IpoDetailUtilities.convertToIpoDetail(ipoDetailDto)));
	}

	@Override
	public IpoDetailDto updateIpoDetail(IpoDetailDto ipoDetailDto) {
		// TODO Auto-generated method stub
		return IpoDetailUtilities.convertToIpoDetailDto(ipoDetailRepo.save(IpoDetailUtilities.convertToIpoDetail(ipoDetailDto)));
	}

	@Override
	public List<IpoDetailDto> findAllIpoDetails() {
		// TODO Auto-generated method stub
		return IpoDetailUtilities.convertToIpoDetailDtoList(ipoDetailRepo.findAll());
	}

	@Override
	public IpoDetailDto findByIpoDetailId(long ipoDetailId) {
		// TODO Auto-generated method stub
		return IpoDetailUtilities.convertToIpoDetailDto(ipoDetailRepo.findById(ipoDetailId).orElse(null));
	}

	@Override
	public IpoDetailDto deleteByIpoDetailId(long ipoDetailId) {
		IpoDetailDto ipoDetailDto = findByIpoDetailId(ipoDetailId);
		ipoDetailRepo.deleteById(ipoDetailId);
		return ipoDetailDto;
	}
	
	

}
