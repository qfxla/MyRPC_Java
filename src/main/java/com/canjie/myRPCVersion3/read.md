如何提升这个rpc的性能? 可以从两个方面入手，网络传输从BIO到NIO，序列化要减少字节流长度，提高序列化反序列化效率

知名的rpc框架：dubbo， grpc都是使用netty底层进行通信的




客户端的代码太乱了， 我们先进行代码重构，才有利于后面使用netty的方式实现客户端， 
    使之不同方式网络连接的客户端有着同样的结构，同样的api

**客户端升级一：**
假如我们现在已经有了两个客户端：SimpleRPCClient(使用java BIO的方式)， NettyRPCClient（使用netty进行网络传输），
    那么它们两者的共性是啥?发送请求与得到response是共性， 而建立连接与发送请求的方式是不同点。
    所以抽取成一个接口RPCClient。
而RPCClientProxy类中需要加入一个RPCClient类变量即可， 传入不同的client(simple,netty), 
    即可调用公共的接口sendRequest发送请求，所以客户端代码结构很清晰了:

RPCClient: 不同的网络连接，网络传输方式的客户端分别实现这个接口

XXXRPCClient: 具体实现类

RPCClientProxy： 动态代理Service类，封装不同的Service请求为Request对象，并且持有一个RPCClient对象， 负责与服务端的通信，


**客户端升级二：**
使用netty方式传输数据：实现NettyRPCServer， NettyRPCCLient，这里建议先学习下netty的启动代码
**服务端升级：**
也是使用netty进行通信

**总结**
此版本我们完成了客户端的重构，使之能够支持多种版本客户端的扩展（实现RPCClient接口）

并且使用netty实现了客户端与服务端的通信

此RPC最大痛点
java自带序列化方式（Java序列化写入不仅是完整的类名，也包含整个类的定义，包含所有被引用的类），不够通用，不够高效

