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

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 14:07 2018/11/19
     * @param:  * @param null
     * 根据品牌ID 修改
     */
    int updateTRecoveryBrandByUUID(TRecoveryBrand tRecoveryBrand);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 9:16 2018/11/20
     * @param:  * @param null
     * 根据品牌ID查询
     */
    TRecoveryBrand selectTRecoveryBrandById(TRecoveryBrand tRecoveryBrand);
   /**
    * @Auther:HuJinHua
    * Description
    * @User: Administrator
    * @Date: 15:28 2018/11/21
    * @param:  * @param null
    * 查询所有品牌
    */
    List<TRecoveryBrand> searchAllBrand();
}
