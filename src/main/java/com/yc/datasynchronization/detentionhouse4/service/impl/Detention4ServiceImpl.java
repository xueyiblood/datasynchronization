package com.yc.datasynchronization.detentionhouse4.service.impl;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SZpb;
import com.yc.datasynchronization.detentionhouse4.mapper.Detention4Mapper;
import com.yc.datasynchronization.detentionhouse4.service.Detention4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Detention4ServiceImpl implements Detention4Service {

    @Autowired
    Detention4Mapper detention4Mapper;


    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public List<SRyjbxxb> getDt4Ryjbxxb(String rybh) {
        return detention4Mapper.getDt4Ryjbxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public List<SRybdxxb> getDt4Rybdxxb(String rybh) {
        return detention4Mapper.getDt4Rybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public List<SZpb> getDt4Zpb(String rybh) {
        return detention4Mapper.getDt4Zpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public int delDt4Zpb(String rybh) {
        return detention4Mapper.delDt4Zpb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public int insDt4Zpb(SZpb zpb) {
        return detention4Mapper.insDt4Zpb(zpb);
    }

    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public int updDt4Ryjbxxb(SRyjbxxb ryjbxx) {
        return detention4Mapper.updDt4Ryjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public int insDt4Ryjbxxb(SRyjbxxb ryjbxx) {
        return detention4Mapper.insDt4Ryjbxxb(ryjbxx);
    }

    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public int delDt4Rybdxxb(String rybh) {
        return detention4Mapper.delDt4Rybdxxb(rybh);
    }

    @Override
    @Transactional(transactionManager = "detention4TransactionManager")
    public int insDt4Rybdxxb(SRybdxxb rybdxx) {
        return detention4Mapper.insDt4Rybdxxb(rybdxx);
    }
}
