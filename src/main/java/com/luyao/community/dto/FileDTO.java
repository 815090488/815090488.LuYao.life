package com.luyao.community.dto;

import lombok.Data;

/**
 * 图片上传
 */
@Data
public class FileDTO {
    private int success;
    private String message;
    private String url;
}
