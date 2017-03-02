package com.zzsharing.service;

import com.zzsharing.model.Message;
import com.zzsharing.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service("messageService")

/**
* Created by 钟述林 393156105@qq.com on 2017/48/02 08:48:22.
*/
public interface IMessageService extends BaseRepository<Message, Integer>, JpaSpecificationExecutor<Message> {

}