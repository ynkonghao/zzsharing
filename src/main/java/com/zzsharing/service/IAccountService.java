package com.zzsharing.service;

import com.zzsharing.model.Account;
import com.zzsharing.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service("accountService")

/**
* Created by 钟述林 393156105@qq.com on 2017/43/02 08:43:57.
*/
public interface IAccountService extends BaseRepository<Account, Integer>, JpaSpecificationExecutor<Account> {

}