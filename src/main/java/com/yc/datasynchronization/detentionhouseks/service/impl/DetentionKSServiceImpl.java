package com.yc.datasynchronization.detentionhouseks.service.impl;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;
import com.yc.datasynchronization.detentionhouseks.mapper.DetentionKSMapper;
import com.yc.datasynchronization.detentionhouseks.service.DetentionKSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetentionKSServiceImpl implements DetentionKSService {


    @Autowired
    private DetentionKSMapper detentionKSMapper;

    @Override
    @Transactional(transactionManager = "detentionKSTransactionManager")
    public List<SLshjxxb> getKSLshjxxb(String hj) {
        return detentionKSMapper.getKSLshjxxb(hj);
    }

    @Override
    @Transactional(transactionManager = "detentionKSTransactionManager")
    public List<SRybdxxb> getKSRsrq() {
        return detentionKSMapper.getKSRsrq();
    }

    @Override
    @Transactional(transactionManager = "detentionKSTransactionManager")
    public List<SYljlb> getKSYljib(String yl) {
        return detentionKSMapper.getKSYljib(yl);
    }

    @Override
    @Transactional(transactionManager = "detentionKSTransactionManager")
    public List<STjcsdj> getKSTjcsdj(String ty) {
        return detentionKSMapper.getKSTjcsdj(ty);
    }
}
