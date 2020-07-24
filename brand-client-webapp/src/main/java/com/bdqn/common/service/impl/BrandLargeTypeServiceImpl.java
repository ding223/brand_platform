package com.bdqn.common.service.impl;

import com.bdqn.common.entity.BrandLargeType;
import com.bdqn.common.entity.RecordStatus;
import com.bdqn.common.mapper.BrandLargeTypeMapper;
import com.bdqn.common.paging.LayuiPage;
import com.bdqn.common.paging.PagingResult;
import com.bdqn.common.service.BrandLargeTypeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by www17 on 2020/7/17.
 */
@Service
public class BrandLargeTypeServiceImpl implements BrandLargeTypeService {

    @Autowired
    private BrandLargeTypeMapper mapper;

    @Override
    public BrandLargeType getBrandLargeType(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveBrandLargeType(BrandLargeType brandLargeType) {
        int count=0;
        if(brandLargeType!=null){
           count= mapper.updateByPrimaryKeySelective(brandLargeType);
        }else{
            brandLargeType.setCreateDate(new Date());
            brandLargeType.setUpdateCount(0);
            brandLargeType.setRecordStatus(RecordStatus.ACTIVE);
            count=mapper.insertSelective(brandLargeType);
        }
        return count;
    }

    @Override
    public int deleteBrandLargeType(BrandLargeType brandLargeType) {
        return mapper.deleteByPrimaryKey(brandLargeType);
    }

    @Override
    public int deleteBrandLargeTypeByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType brandLargeType, LayuiPage page) {
        Example example=new Example(BrandLargeType.class);
        Example.Criteria criteria = example.createCriteria();

        if(brandLargeType.getName()!=null && !"".equals(brandLargeType.getName().trim())){
            criteria.andLike("name","%"+brandLargeType.getName()+"%");
        }

        if(brandLargeType.getCnno() != null && !"".equals(brandLargeType.getCnno())){
            criteria.andLike("cnno", "%"+brandLargeType.getCnno()+"%");
        }

        //排序：目录 升序
        example.orderBy("catalog").asc();

        //分页
        if(page!=null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandLargeType> list = mapper.selectByExample(example);
            PagingResult<BrandLargeType> largeTypePage=new PagingResult(list);

        return largeTypePage;
    }

    @Override
    public List<BrandLargeType> findBrandLargeTypeList(BrandLargeType brandLargeType) {
        //正则表达式
        Example example = new Example(BrandLargeType.class);
        //正则表达式 的过滤
        Example.Criteria cb = example.createCriteria();

        //通过项目名称过滤
        if (brandLargeType.getName() != null && !"".equals(brandLargeType.getName().trim())) {
            cb.andLike("name", "%"+brandLargeType.getName()+"%");
        }
        //	中文序号过滤
        if(brandLargeType.getCnno() != null && !"".equals(brandLargeType.getCnno())){
            cb.andLike("cnno", "%"+brandLargeType.getCnno()+"%");
        }

        //排序：目录 升序
        example.orderBy("catalog").asc();
        List<BrandLargeType> list = mapper.selectByExample(example);
        return list;
    }
}
