package com.canjie.myRPCVersion0.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zcj
 * @creat 2022-03-16-16:36
 */
@Data
@Builder
public class User implements Serializable {
    //客户端和服务端共有的
    private Integer id;
    private String userName;
    private Boolean sex;
}
