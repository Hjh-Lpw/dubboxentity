package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TRecoveryCheckItem;

/**
 * @Auther:HuJinHua
 * @Descrioption:
 * @Date:2018/11/27 11:32
 */
public interface TRecoveryCheckItemService {
   /**
    * @Auther:HuJinHua
    * Description
    * @User: Administrator
    * @Date: 11:44 2018/11/27
    * @param:  * @param null
    * 查询检测项分页
    */
    JqueryTable<TRecoveryCheckItem> selectTRecoveryCheckItem(int pageNo, int pageSize, int draw, TRecoveryCheckItem tRecoveryCheckItem);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 15:40 2018/11/27
     * 根据检查项ID删除
     * @param:  * @param null
     */
    Boolean deleteTRecoveryCheckItemById(TRecoveryCheckItem tRecoveryCheckItem);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 15:40 2018/11/27
     * 新增检查项
     * @param:  * @param null
     */
    int insertTRecoveryCheckItem(TRecoveryCheckItem tRecoveryCheckItem);


    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 15:40 2018/11/27
     * 修改检查项
     * @param:  * @param null
     */
    int updateTRecoveryCheckItem(TRecoveryCheckItem tRecoveryCheckItem);
    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 15:40 2018/11/27
     * 查询检查项
     * @param:  * @param null
     */
    TRecoveryCheckItem selectTRecoveryCheckItemById(TRecoveryCheckItem tRecoveryCheckItem);

}
