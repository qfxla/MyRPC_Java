package com.canjie.myRPCVersion6.client;


import com.canjie.myRPCVersion6.common.RPCRequest;
import com.canjie.myRPCVersion6.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
