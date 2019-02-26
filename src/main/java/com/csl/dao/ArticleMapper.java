package com.csl.dao;

import com.csl.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * @author a
 */
@Mapper
public interface ArticleMapper {
    /**
     * 获得所有的文章
     *
     * @param criteria 查询条件
     * @return 文章列表
     */
    List<Article> findAll(HashMap<String, Object> criteria);
}
