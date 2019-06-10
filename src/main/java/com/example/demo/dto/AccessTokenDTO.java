package com.example.demo.dto;

import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;
    private String redirect_uri;
    private String client_secret;
    private String state;
    private String code;
}
