package com.zzsharing.service;

import com.zzsharing.model.Article;
import com.zzsharing.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service("articleService")

/**
* Created by 钟述林 393156105@qq.com on 2017/32/02 08:32:43.
*/
public interface IArticleService extends BaseRepository<Article, Integer>, JpaSpecificationExecutor<Article> {

}