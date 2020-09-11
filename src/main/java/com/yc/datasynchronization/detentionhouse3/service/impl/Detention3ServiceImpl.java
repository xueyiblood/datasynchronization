package com.yc.datasynchronization.detentionhouse3.service.impl;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SZpb;
import com.yc.datasynchronization.detentionhouse3.mapper.Detention3Mapper;
import com.yc.datasynchronization.detentionhouse3.service.Detention3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Detention3ServiceImpl implements Detention3Service {

    @Autowired
    Detention3Mapper detention3Mapper;

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public List<SRyjbxxb> getDt3Ryjbxxb(String rybh) {
        return detention3Mapper.getDt3Ryjbxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public List<SRybdxxb> getDt3Rybdxxb(String rybh) {
        return detention3Mapper.getDt3Rybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public List<SZpb> getDt3Zpb(String rybh) {
        return detention3Mapper.getDt3Zpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public int delDt3Zpb(String rybh) {
        return detention3Mapper.delDt3Zpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public int insDt3Zpb(SZpb zpb) {
        return detention3Mapper.insDt3Zpb(zpb);
    }

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public int updDt3Ryjbxxb(SRyjbxxb ryjbxx) {
        return detention3Mapper.updDt3Ryjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public int insDt3Ryjbxxb(SRyjbxxb ryjbxx) {
        return detention3Mapper.insDt3Ryjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public int delDt3Rybdxxb(String rybh) {
        return detention3Mapper.delDt3Rybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention3TransactionManager")
    public int insDt3Rybdxxb(SRybdxxb rybdxx) {
        return detention3Mapper.insDt3Rybdxxb(rybdxx);
    }
}
