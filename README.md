
## 版本迭代过程

### 目录

从0开始的RPC的迭代过程：

- [version0版本](#0.一个最简单的RPC调用)：以不到百行的代码完成一个RPC例子
- [version1版本](#1.MyRPC版本1)：完善通用消息格式（request，response），客户端的动态代理完成对request消息格式的封装
- [version2版本](#2.MyRPC版本2)：支持服务端暴露多个服务接口， 服务端程序抽象化，规范化
- [version3版本](#3.MyRPC版本3)：使用高性能网络框架netty的实现网络通信，以及客户端代码的重构
- [version4版本](#4.MyRPC版本4)：自定义消息格式，支持多种序列化方式（java原生， json…）
- [version5版本](#5.MyRPC版本5):   服务器注册与发现的实现，zookeeper作为注册中心
- [version6版本](#MyRPC版本6):   负载均衡的策略的实现
- [version7版本](#7.MyRPC版本7):   客户端缓存服务地址列表, zookeeper监听服务提供者状态，更新客户端缓存**（待实现）**
- [version8版本](#8.MyRPC版本8)： 跨语言的RPC通信（protobuf）**（待实现）**

