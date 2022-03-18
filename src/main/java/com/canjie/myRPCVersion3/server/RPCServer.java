package com.canjie.myRPCVersion3.server;

/**
 * @author zcj
 * @creat 2022-03-17-9:02
 */
public interface RPCServer {
    void start(int port);
    void stop();
}
