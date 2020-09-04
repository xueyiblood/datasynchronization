package com.yc.datasynchronization.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PersonSynchronization {

    /**
     * 注入三个数据库自己的service
     */


    /**
     * 每秒执行一次
     */
    @Scheduled(cron = "0/1 * * * * ?")
    public void personBasicInfoSynchronization(){

        /**
         * 查询信息系统的数据
         */
        System.out.println("..........");


        /**
         * 查询一二三四所的数据
         */



        /**
         * 查询实战平台的数据
         */


        /**
         * 对比后丢入一二三四所
         */


        /**
         * 对比后丢入实战平台
         */

    }



}
