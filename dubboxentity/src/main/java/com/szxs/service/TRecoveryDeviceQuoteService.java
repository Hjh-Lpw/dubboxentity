package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TRecoveryDeviceQuote;

/**
 * @Auther:HuJinHua
 * @Descrioption:
 * @Date:2018/11/25 14:52
 */
public interface TRecoveryDeviceQuoteService {
    JqueryTable<TRecoveryDeviceQuote> selectTRecoveryDeviceQuote(int pageNo, int pageSize, int draw, TRecoveryDeviceQuote tRecoveryDeviceQuote);
    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 11:20 2018/11/22
     * @param:  * @param null
     * 根据ID删除回收报价单
     */
    Boolean deleteDeviceQuoteById(TRecoveryDeviceQuote tRecoveryDeviceQuote);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 11:20 2018/11/22
     * @param:  * @param null
     * 新增回收报价单
     */
    int insertRecoveryDeviceQuote(TRecoveryDeviceQuote tRecoveryDeviceQuote);


    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 11:21 2018/11/22
     * @param:  * @param null
     * 修改回收报价单
     */
    int updateTRecoveryDeviceQuoteByUUID(TRecoveryDeviceQuote tRecoveryDeviceQuote);


    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 11:22 2018/11/22
     * @param:  * @param null
     * 根据ID查询回收报价单
     */
    TRecoveryDeviceQuote searchTRecoveryDeviceQuoteById(TRecoveryDeviceQuote tRecoveryDeviceQuote);
}
