package com.luyao.community.mapper;

import com.luyao.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment record);
}