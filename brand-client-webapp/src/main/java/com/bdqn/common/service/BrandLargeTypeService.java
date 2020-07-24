package com.bdqn.common.service;



import com.bdqn.common.entity.BrandLargeType;
import com.bdqn.common.paging.LayuiPage;
import com.bdqn.common.paging.PagingResult;

import java.util.List;

/**
 * Created by Hunter on 2020-07-17.
 */
public interface BrandLargeTypeService {

    BrandLargeType getBrandLargeType(Long id);

    int saveBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeTypeByIds(Long[] ids);

    PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType brandLargeType, LayuiPage page);

    List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type);
}
