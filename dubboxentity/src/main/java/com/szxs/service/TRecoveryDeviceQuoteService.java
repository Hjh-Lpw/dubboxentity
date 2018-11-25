package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TRecoveryDeviceQuote;

/**
 * @Auther:HuJinHua
 * @Descrioption:
 * @Date:2018/11/22 11:19
 */
public interface TRecoveryDeviceQuoteService {

    /**
     * @Auther:HuJinHua Description
     * @User: Administrator
     * @Date: 11:20 2018/11/22
     * @param: * @param null
     * 查询分页回收报价单
     */
    JqueryTable<TRecoveryDeviceQuote> selectTRecoveryDeviceQuote(int pageNo, int pageSize, int draw, TRecoveryDeviceQuote tRecoveryDeviceQuote);

    /**
     * @Auther:HuJinHua Description
     * @User: Administrator
     * @Date: 11:20 2018/11/22
     * @param: * @param null
     * 根据ID删除回收报价单
     */
    Boolean deleteDeviceQuoteById(TRecoveryDeviceQuote tRecoveryDeviceQuote);

    /**
     * @Auther:HuJinHua Description
     * @User: Administrator
     * @Date: 11:20 2018/11/22
     * @param: * @param null
     * 新增回收报价单
     */
    int insertRecoveryDeviceQuote(TRecoveryDeviceQuote tRecoveryDeviceQuote);

    /**
     * @Auther:HuJinHua Description
     * @User: Administrator
     * @Date: 11:21 2018/11/22
     * @param: * @param null
     * 修改回收报价单
     */
    int updateTRecoveryDeviceQuoteByUUID(TRecoveryDeviceQuote tRecoveryDeviceQuote);

    /**
     * @Auther:HuJinHua Description
     * @User: Administrator
     * @Date: 11:22 2018/11/22
     * @param: * @param null
     * 根据ID查询回收报价单
     */
    TRecoveryDeviceQuote searchTRecoveryDeviceQuoteById(TRecoveryDeviceQuote tRecoveryDeviceQuote);
}
