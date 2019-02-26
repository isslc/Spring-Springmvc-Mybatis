package com.csl.service;

import com.csl.entity.Article;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;

/**
 * @author a
 */
public interface ArticleService {

    /**
     * 分页显示
     *
     * @param pageIndex 第几页开始
     * @param pageSize  一页显示多少
     * @param criteria  查询条件
     * @return 文章列表
     */
    PageInfo<Article> pageArticle(Integer pageIndex,
                                  Integer pageSize,
                                  HashMap<String, Object> criteria);
}
