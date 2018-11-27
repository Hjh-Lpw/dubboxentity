package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.RecoveryDevice1;
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
     * @Date: 17:56 2018/11/19
     * @param:  * @param null
     * 查询检测项分页
     */
    JqueryTable<RecoveryDevice1> selectTRecoveryCheckItem(int pageNo, int pageSize, int draw, TRecoveryCheckItem tRecoveryCheckItem);

}
