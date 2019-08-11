package com.luyao.community.dto;

import com.luyao.community.model.User;
import lombok.Data;

/**
 * Question对象添加User对象，查找user对象的属性
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
