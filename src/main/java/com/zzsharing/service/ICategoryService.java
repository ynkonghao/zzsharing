package com.zzsharing.service;

import com.zzsharing.model.Category;
import com.zzsharing.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service("categoryService")

/**
* Created by 钟述林 393156105@qq.com on 2017/48/01 22:48:54.
*/
public interface ICategoryService extends BaseRepository<Category, Integer>, JpaSpecificationExecutor<Category> {

}