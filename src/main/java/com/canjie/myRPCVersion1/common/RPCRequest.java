package com.canjie.myRPCVersion1.common;

/**
 * @author zcj
 * @creat 2022-03-16-19:33
 */

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 在上个例子中，我们的Request仅仅只发送了一个id参数过去，这显然是不合理的，
 * 因为在服务端不会只有一个服务一个方法，因此只传递参数服务端不会知道调用哪个方法
 * 因此一个RPC请求中，client发送应该是需要调用的Service接口名，方法名，参数，参数类型
 * 使用Java自带的序列方式（实现接口）
 */
@Data
@Builder
public class RPCRequest implements Serializable {
    // 服务类名，客户端只知道接口名，在服务端中用接口名指向实现类
    private String interfaceName;
    // 方法名
    private String methodName;
    // 参数列表
    private Object[] params;
    // 参数类型
    private Class<?>[] paramsTypes;
}
