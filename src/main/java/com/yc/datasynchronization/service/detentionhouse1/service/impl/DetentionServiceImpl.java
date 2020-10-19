package com.yc.datasynchronization.service.detentionhouse1.service.impl;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SZpb;
import com.yc.datasynchronization.service.detentionhouse1.mapper.DetentionMapper;
import com.yc.datasynchronization.service.detentionhouse1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetentionServiceImpl implements DetentionService {

    @Autowired
    DetentionMapper detentionMapper;


    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public List<SRyjbxxb> getDt1Ryjbxxb(String rybh) {
        return detentionMapper.getDt1Ryjbxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public List<SRybdxxb> getDt1Rybdxxb(String rybh) {
        return detentionMapper.getDt1Rybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public List<SZpb> getDt1Zpb(String rybh) {
        return detentionMapper.getDt1Zpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public int delDt1Zpb(String rybh) {
        return detentionMapper.delDt1Zpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public int insDt1Zpb(SZpb zpb) {
        return detentionMapper.insDt1Zpb(zpb);
    }

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public int updDt1Ryjbxxb(SRyjbxxb ryjbxx) {
        return detentionMapper.updDt1Ryjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public int insDt1Ryjbxxb(SRyjbxxb ryjbxx) {
        return detentionMapper.insDt1Ryjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public int delDt1Rybdxxb(String rybh) {
        return detentionMapper.delDt1Rybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public int insDt1Rybdxxb(SRybdxxb rybdxx) {
        return detentionMapper.insDt1Rybdxxb(rybdxx);
    }

}
