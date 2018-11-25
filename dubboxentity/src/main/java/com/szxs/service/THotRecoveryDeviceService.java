package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.THotRecoveryDevice;

/**
 * @Auther:HuJinHua
 * @Descrioption:
 * @Date:2018/11/25 21:40
 */
public interface THotRecoveryDeviceService {
    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 17:56 2018/11/19
     * @param:  * @param null
     * 查询所有热门手机分页
     */
    JqueryTable<THotRecoveryDevice> selectTHotRecoveryDevice(int pageNo, int pageSize, int draw, THotRecoveryDevice tHotRecoveryDevice);
}
