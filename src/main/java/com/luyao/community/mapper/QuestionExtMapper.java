package com.luyao.community.mapper;


import com.luyao.community.dto.QuestionQueryDTO;
import com.luyao.community.model.Question;

import java.util.List;

/**
 * 扩展的mapper
 */
public interface QuestionExtMapper {
    //增加阅读数
    int incView(Question record);

    int incCommentCount(Question record);
    
    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}