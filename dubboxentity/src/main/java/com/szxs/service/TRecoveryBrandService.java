package com.szxs.service;

import com.szxs.entity.TRecoveryBrand;

import java.util.List;

/**
 * @Auther:HuJinHua
 * @Descrioption:
 * @Date:2018/11/7 09:59
 */
public interface TRecoveryBrandService {
    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 19:47 2018/11/6
     * @param:  * @param null
     * 查询回收手机品牌
     */
    List<TRecoveryBrand> selectTRecoveryBrand();
}
