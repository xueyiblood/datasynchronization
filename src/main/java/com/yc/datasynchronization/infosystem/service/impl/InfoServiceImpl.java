package com.yc.datasynchronization.infosystem.service.impl;

import com.yc.datasynchronization.infosystem.entity.Lshjxx;
import com.yc.datasynchronization.infosystem.entity.Rybdxx;
import com.yc.datasynchronization.infosystem.entity.Ryjbxx;
import com.yc.datasynchronization.infosystem.entity.Zpb;
import com.yc.datasynchronization.infosystem.mapper.InfoMapper;
import com.yc.datasynchronization.infosystem.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("InfoService")
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;


    @Override
    @Transactional(transactionManager = "infoTransactionManager")
    public List<Ryjbxx> getInfoRyjbxxb(String jsbh) {
        if(jsbh != null && jsbh != ""){
            return infoMapper.getInfoRyjbxxb(jsbh);
        }else {
            return null;
        }

    }

    @Override
    @Transactional(transactionManager = "infoTransactionManager")
    public List<Rybdxx> getInfoRybdxxb(String rybh) {
        if(rybh != null && rybh != ""){
            return infoMapper.getInfoRybdxxb(rybh);
        }else {
            return null;
        }
    }

    @Override
    @Transactional(transactionManager = "infoTransactionManager")
    public Zpb getInfoZpb(String rybh) {
        if(rybh != null && rybh != ""){
            return infoMapper.getInfoZpb(rybh);
        }else {
            return null;
        }
    }

    @Override
    @Transactional(transactionManager = "infoTransactionManager")
    public List<Lshjxx> getInfoLshjxxb(String jsbh,String key) {
        return infoMapper.getInfoLshjxxb(jsbh,key);
    }

    @Override
    @Transactional(transactionManager = "infoTransactionManager")
    public List<Rybdxx> getInfoRsrq(String jsbh) {
        return infoMapper.getInfoRsrq(jsbh);
    }

}
