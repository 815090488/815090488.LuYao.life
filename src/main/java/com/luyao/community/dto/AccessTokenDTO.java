package com.luyao.community.dto;

import lombok.Data;

/**
 * 授权参数封装成一个对象
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String redirect_uri;
    private String client_secret;
    private String state;
    private String code;
}
