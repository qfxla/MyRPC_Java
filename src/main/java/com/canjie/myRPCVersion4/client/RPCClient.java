package com.canjie.myRPCVersion4.client;


import com.canjie.myRPCVersion4.common.RPCRequest;
import com.canjie.myRPCVersion4.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
