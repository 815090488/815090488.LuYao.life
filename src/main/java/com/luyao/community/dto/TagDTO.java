package com.luyao.community.dto;

import lombok.Data;

import java.util.List;

/**
 * 标签对象
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
