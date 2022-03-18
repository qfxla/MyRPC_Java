package com.canjie.myRPCVersion3.server;

import lombok.Data;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zcj
 * @creat 2022-03-17-9:03
 */
@Deprecated
public class SimpleRPCRPCServer {
    // 存着服务接口名-> service对象的map
    private ServiceProvider serviceProvider;

    public SimpleRPCRPCServer(ServiceProvider serviceProvide){
        this.serviceProvider = serviceProvide;
    }

    public void start(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("服务端启动了");
            // BIO的方式监听Socket
            while (true){
                Socket socket = serverSocket.accept();
                // 开启一个新线程去处理
                new Thread(new WorkThread(socket,serviceProvider)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("服务器启动失败");
        }
    }

    public void stop(){
    }
}
