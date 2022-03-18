package com.canjie.myRPCVersion3.client;

import com.canjie.myRPCVersion3.common.RPCRequest;
import com.canjie.myRPCVersion3.common.RPCResponse;

/**
 * @author zcj
 * @creat 2022-03-17-9:59
 */
public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
