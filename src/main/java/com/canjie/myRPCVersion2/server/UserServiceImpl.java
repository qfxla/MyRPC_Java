package com.canjie.myRPCVersion2.server;

import com.canjie.myRPCVersion2.common.User;
import com.canjie.myRPCVersion2.service.UserService;

/**
 * @author zcj
 * @creat 2022-03-16-21:34
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserByUserId(Integer id) {
        // 模拟从数据库中取用户的行为
        User user = User.builder().id(id).userName("canjie").sex(true).build();
        System.out.println("客户端查询了" + id + "用户");
        return user;
    }

    @Override
    public Integer insertUserId(User user) {
        System.out.println("插入数据成功：" + user);
        return 1;
    }
}
