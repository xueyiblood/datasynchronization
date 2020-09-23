package com.yc.datasynchronization.actual.service.impl;

import com.yc.datasynchronization.actual.entity.*;
import com.yc.datasynchronization.actual.mapper.ActualMapper;
import com.yc.datasynchronization.actual.service.ActualService;
import com.yc.datasynchronization.infosystem.entity.Zpb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("ActualService")
public class ActualServiceImpl implements ActualService {

    @Autowired
    private ActualMapper actualMapper;


    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public List<RyjbxxbKss> getActualRyjbxxb(String rybh) {
        if(rybh != null && rybh != ""){
            return actualMapper.getActualRyjbxxb(rybh);
        }else {
            return null;
        }
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public List<RybdxxbKss> getActualRybdxxb(String rybh) {
        if(rybh != null && rybh != ""){
            return actualMapper.getActualRybdxxb(rybh);
        }else {
            return null;
        }
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public List<Zpb> getActualZpb(String rybh) {
        if(rybh != null && rybh != ""){
            return actualMapper.getActualZpb(rybh);
        }else {
            return null;
        }
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int updActualZpb(Zpb zpb) {
        return actualMapper.updActualZpb(zpb);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int insActualZpb(ZpbKss zpb) {
        return actualMapper.insActualZpb(zpb);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int updActualRyjbxxb(RyjbxxbKss ryjbxx) {
        return actualMapper.updActualRyjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int insActualRyjbxxb(RyjbxxbKss ryjbxx) {
        return actualMapper.insActualRyjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int delActualRybdxxb(String rybh) {
        return actualMapper.delActualRybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int insActualRybdxxb(RybdxxbKss rybdxx) {
        return actualMapper.insActualRybdxxb(rybdxx);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int delActualZpb(String rybh) {
        return actualMapper.delActualZpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public List<LshjxxbKss> getActualLshj(LshjxxbKss lshjxxbKss) {
        return actualMapper.getActualLshj(lshjxxbKss);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int insActualLshj(LshjxxbKss lshjxxbKss) {
        return actualMapper.insActualLshj(lshjxxbKss);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int upaActualRybdxxRsrq(String rybh, Date rsrq) {
        return actualMapper.upaActualRybdxxRsrq(rybh,rsrq);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public List<YljlbKss> getActualSnyl(YljlbKss yljlbKss) {
        return actualMapper.getActualSnyl(yljlbKss);
    }

    @Override
    public int insActualSnyl(YljlbKss yljlbKss) {
        return actualMapper.insActualSnyl(yljlbKss);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public List<TjcsdjKss> getActualTy(TjcsdjKss tjcsdjKss) {
        return actualMapper.getActualTy(tjcsdjKss);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int insActualTy(TjcsdjKss tjcsdjKss) {
        return actualMapper.insActualTy(tjcsdjKss);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public List<TxxxbKss> getActualTx(TxxxbKss txxxbKss) {
        return actualMapper.getActualTx(txxxbKss);
    }

    @Override
    @Transactional(transactionManager = "actualTransactionManager")
    public int insActualTx(TxxxbKss txxxbKss) {
        return actualMapper.insActualTx(txxxbKss);
    }
}
