package com.szxs.service;

import com.szxs.entity.User;

public interface UserService {
    /**
     * 根据用户ID查询
     * @param userId
     * @return
     */
    User getUser(Integer userId);
}
