package com.zzsharing;

import com.zzsharing.repository.base.BaseRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by konghao on 2016/12/15.
 */
@EnableJpaRepositories(basePackages = {"com.zzsharing"},
        repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class//指定自己的工厂类
)
@SpringBootApplication
public class ZzsharingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZzsharingApplication.class,args);
    }
}
