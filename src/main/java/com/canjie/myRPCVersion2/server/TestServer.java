package com.canjie.myRPCVersion2.server;


import com.canjie.myRPCVersion2.common.Blog;
import com.canjie.myRPCVersion2.service.BlogService;
import com.canjie.myRPCVersion2.service.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zcj
 * @creat 2022-03-16-21:33
 */
public class TestServer {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        BlogService blogService = new BlogServiceImpl();

//        Map<String,Object> serviceProvide = new HashMap<>();
//        serviceProvide.put("com.canjie.myRPCVersion2.service.UserService",userService);
//        serviceProvide.put("com.canjie.myRPCVersion2.service.BlogService",blogService);
        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.provideServiceInterface(userService);
        serviceProvider.provideServiceInterface(blogService);

        RPCServer RPCServer = new ThreadPoolRPCRPCServer(serviceProvider);
        RPCServer.start(8899);
    }
}
