package com.luyao.community.dto;

import lombok.Data;

/**
 * 封装user对象
 */
@Data
public class GithubUser {
    private  String name;
    private  Long id;
    private  String bio;
    private  String avatar_url;
}
