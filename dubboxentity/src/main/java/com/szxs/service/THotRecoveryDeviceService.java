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
    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 22:00 2018/11/25
     * 根据热门手机ID删除
     * @param:  * @param null
     */
    Boolean deleteTHotRecoveryDeviceById(THotRecoveryDevice tHotRecoveryDevice);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 22:00 2018/11/25
     * 新增热门手机
     * @param:  * @param null
     */
    int insertTHotRecoveryDevice(THotRecoveryDevice tHotRecoveryDevice);


    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 22:00 2018/11/25
     * 修改热门手机
     * @param:  * @param null
     */
    int updateTHotRecoveryDevice(THotRecoveryDevice tHotRecoveryDevice);
    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 22:00 2018/11/25
     * 根据热门手机ID查询
     * @param:  * @param null
     */
    THotRecoveryDevice selectTHotRecoveryDeviceById(THotRecoveryDevice tHotRecoveryDevice);

}
