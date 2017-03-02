package com.zzsharing.service;

import com.zzsharing.model.Sponsor;
import com.zzsharing.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service("sponsorService")
/**
* Created by 钟述林 393156105@qq.com on 2017/53/02 08:53:57.
*/
public interface ISponsorService extends BaseRepository<Sponsor, Integer>, JpaSpecificationExecutor<Sponsor> {

}