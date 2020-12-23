package com.sg.smc.service;

import java.util.List;

import com.sg.smc.dto.IpoDetailDto;

public interface IpoDetailService {
	
	public IpoDetailDto addIpoDetail(IpoDetailDto ipoDetailDto);
	public IpoDetailDto updateIpoDetail(IpoDetailDto ipoDetailDto);
	public List<IpoDetailDto> findAllIpoDetails();
	public IpoDetailDto findByIpoDetailId(long ipoDetailId);
	public IpoDetailDto deleteByIpoDetailId(long ipoDetailId);

}
