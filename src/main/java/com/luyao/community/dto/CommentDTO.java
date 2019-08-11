package com.luyao.community.dto;

import com.luyao.community.model.User;
import lombok.Data;

/**
 * 回复功能
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
