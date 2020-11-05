package com.yc.datasynchronization.job.oldksstonew;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SZpb;
import com.yc.datasynchronization.service.detentionhouseks.mapper.DetentionKSMapper;
import com.yc.datasynchronization.service.detentionhousewj.mapper.DetentionWJMapper;
import com.yc.datasynchronization.service.infosystem.entity.Rybdxx;
import com.yc.datasynchronization.service.infosystem.entity.Ryjbxx;
import com.yc.datasynchronization.service.infosystem.entity.Zpb;
import com.yc.datasynchronization.service.infosystem.mapper.InfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;

@Component
public class personChangeSync {

    @Autowired
    private DetentionKSMapper detentionWJMapper;

    @Autowired
    private InfoMapper infoMapper;


    /**
     * 每20分钟执行一次
     */
    @Scheduled(cron = "0 10 21 * * ?")
//    @Scheduled(cron = "*/10 * * * * ?")
    public void personChaneeSync() throws IOException {

        /**
         * 人员基本信息，人员变动信息，照片
         */


        List<SRyjbxxb> ryjbxxbs = detentionWJMapper.getRyjbxx();

        if (!CollectionUtils.isEmpty(ryjbxxbs)) {
            for (SRyjbxxb ryjbxxb : ryjbxxbs) {


                Ryjbxx ryjbxx = new Ryjbxx();
                BeanUtils.copyProperties(ryjbxxb, ryjbxx);

                ryjbxx.setZyjsbh("320583111");
                try {
                    infoMapper.insertIntoRyjbxxb(ryjbxx);
                } catch (Exception ex) {
                    String s = "1";
                }
            }
        }


        List<SRybdxxb> rybdxxbs = detentionWJMapper.getRybdxxb();

        if (!CollectionUtils.isEmpty(rybdxxbs)) {
            for (SRybdxxb rybdxxb : rybdxxbs) {
                Rybdxx rybdxx = new Rybdxx();
                BeanUtils.copyProperties(rybdxxb, rybdxx);

                rybdxx.setIsdel("0");
                rybdxx.setZyjsbh("320583111");
                infoMapper.insertIntoRybdxxb(rybdxx);
            }
        }


        List<SZpb> pictures = detentionWJMapper.getZpb();

        if (!CollectionUtils.isEmpty(pictures)) {
            for (SZpb picture : pictures) {
                Zpb zp = new Zpb();
                BeanUtils.copyProperties(picture, zp);

                zp.setIsdel("0");
                zp.setZyjsbh("320583111");
                infoMapper.insertIntoZpb(zp);
            }
        }


    }


}
