package com.bdqn.commom.service;

import com.bdqn.common.entity.BrandLargeType;
import com.bdqn.common.entity.RecordStatus;
import com.bdqn.common.paging.LayuiPage;
import com.bdqn.common.paging.PagingResult;
import com.bdqn.common.service.BrandLargeTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


/**
 * Created by www17 on 2020/7/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BrandLargeTypeServiceImpl {

    @Autowired
    private BrandLargeTypeService brandLargeTypeService;

    @Test
    public void getBrandLargeType() {
        BrandLargeType brandLargeType = brandLargeTypeService.getBrandLargeType(1L);
        System.out.println(brandLargeType);
    }

    @Test
    public void saveBrandLargeType() {
        BrandLargeType brandLargeType = new BrandLargeType();
        brandLargeType.setId(1L);
        brandLargeType.setUpdateDate(new Date());
        brandLargeTypeService.saveBrandLargeType(brandLargeType);
    }

    @Test
    public void saveBrandLargeType2() {
        BrandLargeType brandLargeType = new BrandLargeType();
//        brandLargeType.setId(1L);
        brandLargeType.setNo("046");
        brandLargeType.setRecordStatus(RecordStatus.ACTIVE);
        brandLargeType.setUpdateDate(new Date());
        brandLargeType.setCreateDate(new Date());
        brandLargeType.setUpdateCount(0);
        brandLargeTypeService.saveBrandLargeType(brandLargeType);

        System.out.println(brandLargeType);
        //brandLargeTypeService.deleteBrandLargeType(brandLargeType);
    }

    @Test
    public void deleteBrandLargeType() {
        BrandLargeType brandLargeType = new BrandLargeType();
        brandLargeType.setId(59L);
        brandLargeType.setNo("046");
        brandLargeType.setRecordStatus(RecordStatus.ACTIVE);
        brandLargeType.setUpdateDate(new Date());
        brandLargeType.setCreateDate(new Date());
        brandLargeType.setUpdateCount(0);
        brandLargeTypeService.deleteBrandLargeType(brandLargeType);
    }

    @Test
    public void deleteBrandLargeTypeByIds() {
        Long[] ids = new Long[]{60L, 61l};
        int i = brandLargeTypeService.deleteBrandLargeTypeByIds(ids);
        System.out.println(i);
    }


    @Test
    public void findBrandLargeType() {
        BrandLargeType brandLargeType = new BrandLargeType();
        LayuiPage page = new LayuiPage();
        page.setPage(2);

        PagingResult<BrandLargeType> pageResult
                = brandLargeTypeService.findBrandLargeType(brandLargeType, page);

        System.out.println("总条数："+pageResult.getTotalCount());
        for(BrandLargeType item:pageResult.getResult()){
            System.out.println(item);
        }
    }
}
