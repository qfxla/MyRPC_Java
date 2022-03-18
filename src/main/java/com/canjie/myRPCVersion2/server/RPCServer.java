package com.canjie.myRPCVersion2.server;

/**
 * @author zcj
 * @creat 2022-03-16-21:32
 */
//抽象RPCServer，开放封闭原则
public interface RPCServer {
    void start(int port);
    void stop();
}
