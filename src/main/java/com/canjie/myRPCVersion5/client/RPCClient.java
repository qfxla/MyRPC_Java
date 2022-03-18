package com.canjie.myRPCVersion5.client;


import com.canjie.myRPCVersion5.common.RPCRequest;
import com.canjie.myRPCVersion5.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
