package com.bdqn.commom.service;

import com.bdqn.common.entity.BrandGnSmalltypeItem;
import com.bdqn.common.entity.vo.BrandGnSmalltypeItemVo;
import com.bdqn.common.paging.LayuiPage;
import com.bdqn.common.paging.PagingResult;
import com.bdqn.common.service.BrandGnSmalltypeItemService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Hunter on 2020-07-23.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BrandGnSmalltypeItemServiceImplTest {

    @Autowired
    private BrandGnSmalltypeItemService service;

    @Test
    public void findBrandGnSmalltypeItemList() {
        BrandGnSmalltypeItemVo vo = new BrandGnSmalltypeItemVo();
        vo.setLargeTypeId(1L);
        vo.setFilter("工业用碘");
        LayuiPage page = new LayuiPage();
        page.setPage(1);

        PagingResult<BrandGnSmalltypeItem> pageResult = service.findBrandGnSmalltypeItemList(vo, page);

        System.out.println("总条数：" + pageResult.getTotalCount());
        for (BrandGnSmalltypeItem item : pageResult.getResult()) {
            System.out.println(item);
        }
    }
}
