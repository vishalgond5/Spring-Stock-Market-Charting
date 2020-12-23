package com.sg.smc.utilities;

import java.util.ArrayList;
import java.util.List;

import com.sg.smc.bean.IpoDetail;
import com.sg.smc.dto.IpoDetailDto;

public class IpoDetailUtilities {

	public static IpoDetailDto convertToIpoDetailDto(IpoDetail ipoDetail) {

		IpoDetailDto ipoDetailDto = new IpoDetailDto();

		ipoDetailDto.setIpoDetailId(ipoDetail.getIpoDetailId());
		ipoDetailDto.setCompanyName(ipoDetail.getCompanyName());
		ipoDetailDto.setStockExchangeName(ipoDetail.getStockExchangeName());
		ipoDetailDto.setPricePerShare(ipoDetail.getPricePerShare());
		ipoDetailDto.setOpenDateTime(ipoDetail.getOpenDateTime());
		ipoDetailDto.setIpoRemarks(ipoDetail.getIpoRemarks());
		ipoDetailDto.setTotalNoOfShares(ipoDetail.getTotalNoOfShares());
		
		return ipoDetailDto;

	}

	public static IpoDetail convertToIpoDetail(IpoDetailDto ipoDetailDto) {

		IpoDetail ipoDetail = new IpoDetail();
		
		ipoDetail.setIpoDetailId(ipoDetailDto.getIpoDetailId());
		ipoDetail.setCompanyName(ipoDetailDto.getCompanyName());
		ipoDetail.setStockExchangeName(ipoDetailDto.getStockExchangeName());
		ipoDetail.setPricePerShare(ipoDetailDto.getPricePerShare());
		ipoDetail.setOpenDateTime(ipoDetailDto.getOpenDateTime());
		ipoDetail.setIpoRemarks(ipoDetailDto.getIpoRemarks());
		ipoDetail.setTotalNoOfShares(ipoDetailDto.getTotalNoOfShares());
		
		return ipoDetail;

	}

	public static List<IpoDetailDto> convertToIpoDetailDtoList(List<IpoDetail> list) {
		List<IpoDetailDto> dtolist = new ArrayList<IpoDetailDto>();
		for (IpoDetail ipoDetail : list)
			dtolist.add(convertToIpoDetailDto(ipoDetail));
		return dtolist;
	}
}
