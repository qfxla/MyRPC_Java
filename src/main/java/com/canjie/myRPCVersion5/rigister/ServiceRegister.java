package com.canjie.myRPCVersion5.rigister;

/**
 * @author zcj
 * @creat 2022-03-17-17:17
 */

import java.net.InetSocketAddress;

/**
 *  服务注册接口，两大基本功能，注册：保存服务与地址。 查询：根据服务名查找地址
 */
public interface ServiceRegister {
    void register(String serviceName, InetSocketAddress serverAddress);
    InetSocketAddress serviceDiscovery(String serviceName);
}
