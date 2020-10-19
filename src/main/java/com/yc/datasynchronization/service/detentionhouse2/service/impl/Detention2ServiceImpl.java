package com.yc.datasynchronization.service.detentionhouse2.service.impl;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SZpb;
import com.yc.datasynchronization.service.detentionhouse2.mapper.Detention2Mapper;
import com.yc.datasynchronization.service.detentionhouse2.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Detention2ServiceImpl implements Detention2Service {

    @Autowired
    Detention2Mapper detention2Mapper;

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public List<SRyjbxxb> getDt2Ryjbxxb(String rybh) {
        return detention2Mapper.getDt2Ryjbxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public List<SRybdxxb> getDt2Rybdxxb(String rybh) {
        return detention2Mapper.getDt2Rybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public List<SZpb> getDt2Zpb(String rybh) {
        return detention2Mapper.getDt2Zpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public int delDt2Zpb(String rybh) {
        return detention2Mapper.delDt2Zpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public int insDt2Zpb(SZpb zpb) {
        return detention2Mapper.insDt2Zpb(zpb);
    }

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public int updDt2Ryjbxxb(SRyjbxxb ryjbxx) {
        return detention2Mapper.updDt2Ryjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public int insDt2Ryjbxxb(SRyjbxxb ryjbxx) {
        return detention2Mapper.insDt2Ryjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public int delDt2Rybdxxb(String rybh) {
        return detention2Mapper.delDt2Rybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention2TransactionManager")
    public int insDt2Rybdxxb(SRybdxxb rybdxx) {
        return detention2Mapper.insDt2Rybdxxb(rybdxx);
    }
}
