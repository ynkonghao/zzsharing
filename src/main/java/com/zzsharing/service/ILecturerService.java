package com.zzsharing.service;

import com.zzsharing.model.Lecturer;
import com.zzsharing.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service("lecturerService")

/**
* Created by 钟述林 393156105@qq.com on 2017/40/02 08:40:43.
*/
public interface ILecturerService extends BaseRepository<Lecturer, Integer>, JpaSpecificationExecutor<Lecturer> {

}