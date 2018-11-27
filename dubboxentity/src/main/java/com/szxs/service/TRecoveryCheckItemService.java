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

}
