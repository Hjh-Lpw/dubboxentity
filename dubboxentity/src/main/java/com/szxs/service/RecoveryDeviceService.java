package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.RecoveryDevice1;

/**
 * @Auther:HuJinHua
 * @Descrioption:
 * @Date:2018/11/19 17:56
 */
public interface RecoveryDeviceService {
    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 17:56 2018/11/19
     * @param:  * @param null
     * 查询所有回收机型分页
     */
    JqueryTable<RecoveryDevice1> selectRecoveryDevice(int pageNo, int pageSize, int draw, RecoveryDevice1 recoveryDevice1);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 8:53 2018/11/14
     * @param:  * @param null
     * 根据机型ID 删除
     */
    Boolean deleteDeviceById(RecoveryDevice1 recoveryDevice1);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 9:56 2018/11/14
     * @param:  * @param null
     * 新增回收手机机型
     */
    int insertRecoveryDevice(RecoveryDevice1 recoveryDevice1);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 14:07 2018/11/19
     * @param:  * @param null
     * 根据机型ID 修改
     */
    int updateTRecoveryDeviceByUUID(RecoveryDevice1 recoveryDevice1);

    /**
     * @Auther:HuJinHua
     * Description
     * @User: Administrator
     * @Date: 15:04 2018/11/20
     * @param:  * @param null
     * 根据ID查询对象
     */
    RecoveryDevice1 searchRecoveryDeviceById(RecoveryDevice1 recoveryDevice1);
}
