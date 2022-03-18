package com.canjie.myRPCVersion1.service;

import com.canjie.myRPCVersion0.common.User;

/**
 * @author zcj
 * @creat 2022-03-16-19:48
 */
public interface UserService {
    // 客户端通过这个接口调用服务端的实现类
    User getUserByUserId(Integer id);
    // 给这个服务增加一个功能
    Integer insertUserId(User user);
}
