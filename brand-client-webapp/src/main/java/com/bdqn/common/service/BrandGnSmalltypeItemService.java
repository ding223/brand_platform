package com.bdqn.common.service;


import com.bdqn.common.entity.BrandGnSmalltypeItem;
import com.bdqn.common.entity.vo.BrandGnSmalltypeItemVo;
import com.bdqn.common.paging.LayuiPage;
import com.bdqn.common.paging.PagingResult;

public interface BrandGnSmalltypeItemService {

    BrandGnSmalltypeItem getBrandGnSmalltypeItem(Long id);

    int saveBrandGnSmalltypeItem(BrandGnSmalltypeItem brandGnSmalltypeItem);

    int deleteBrandGnSmalltypeItem(BrandGnSmalltypeItem brandGnSmalltypeItem);

    int deleteBrandGnSmalltypeItemByIds(Long[] ids);

    PagingResult<BrandGnSmalltypeItem> findBrandGnSmalltypeItem(BrandGnSmalltypeItem item, LayuiPage page);

    PagingResult<BrandGnSmalltypeItem> findBrandGnSmalltypeItemList(BrandGnSmalltypeItemVo vo, LayuiPage page);
//    List<BrandGnSmalltypeItem> findBrandGnSmalltypeItemList(BrandGnSmalltypeItemVo vo, LayuiPage page);
}