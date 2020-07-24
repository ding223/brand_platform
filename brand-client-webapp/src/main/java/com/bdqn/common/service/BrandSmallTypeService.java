package com.bdqn.common.service;



import com.bdqn.common.entity.BrandSmallType;
import com.bdqn.common.paging.LayuiPage;
import com.bdqn.common.paging.PagingResult;

import java.util.List;

public interface BrandSmallTypeService {

	BrandSmallType getBrandSmallType(String smallNo);

	BrandSmallType getBrandSmallType(Long SmallTypeId);

	int saveBrandSmallType(BrandSmallType brandSmallType);

	int deleteBrandSmallType(BrandSmallType brandSmallType);

	int deleteBrandSmallTypeByIds(Long[] ids);

	PagingResult<BrandSmallType> findBrandSmallType(BrandSmallType brandSmallType, LayuiPage page);

	List<BrandSmallType> findBrandSmallTypeList(BrandSmallType brandSmallType);
}