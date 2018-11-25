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
}
