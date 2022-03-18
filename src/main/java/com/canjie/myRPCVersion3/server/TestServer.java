package com.canjie.myRPCVersion3.server;

import com.canjie.myRPCVersion3.service.BlogService;
import com.canjie.myRPCVersion3.service.BlogServiceImpl;
import com.canjie.myRPCVersion3.service.UserService;
import com.canjie.myRPCVersion3.service.UserServiceImpl;

/**
 * @author zcj
 * @creat 2022-03-17-9:03
 */
public class TestServer {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        BlogService blogService = new BlogServiceImpl();

//        Map<String, Object> serviceProvide = new HashMap<>();
//        serviceProvide.put("com.ganghuan.myRPCVersion2.service.UserService",userService);
//        serviceProvide.put("com.ganghuan.myRPCVersion2.service.BlogService",blogService);
        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.provideServiceInterface(userService);
        serviceProvider.provideServiceInterface(blogService);

        RPCServer RPCServer = new NettyRPCServer(serviceProvider);
        RPCServer.start(8899);
    }
}
