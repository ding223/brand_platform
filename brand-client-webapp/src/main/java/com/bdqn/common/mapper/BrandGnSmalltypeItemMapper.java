package com.bdqn.common.mapper;

import com.bdqn.common.entity.BrandGnSmalltypeItem;
import com.bdqn.common.entity.vo.BrandGnSmalltypeItemVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandGnSmalltypeItemMapper extends Mapper<BrandGnSmalltypeItem> {
    List<BrandGnSmalltypeItem> findByBrandGnSmalltypeItemVo(BrandGnSmalltypeItemVo vo);
}