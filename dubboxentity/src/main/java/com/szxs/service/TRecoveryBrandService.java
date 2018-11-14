package com.szxs.service;

import com.szxs.entity.JqueryTable;
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
     * 查询所有回收手机品牌分页
     */
    JqueryTable<TRecoveryBrand> selectRecoveryBrand(int pageNo, int pageSize, int draw, TRecoveryBrand appInfo);


    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 11:14 2018/11/13
     * @param:  * @param null
     * 查询所有回收手机品牌
     */
    List<TRecoveryBrand> selectRecover();
    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 11:05 2018/11/13
     * @param:  * @param null
     * 根据编码和名字查询
     */
    List<TRecoveryBrand> selectRecoverByType(TRecoveryBrand tRecoveryBrand);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 8:53 2018/11/14
     * @param:  * @param null
     * 根据品牌ID 删除
     */
    Boolean deleteBrandById(TRecoveryBrand tRecoveryBrand);


    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 9:56 2018/11/14
     * @param:  * @param null
     * 新增回收手机品牌
     */
    int insertTRecoveryBrand(TRecoveryBrand tRecoveryBrand);
}
