package com.yc.datasynchronization.service.detentionhousecs.service.impl;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhousecs.entity.*;

import com.yc.datasynchronization.service.detentionhousecs.mapper.DetentionCSMapper;
import com.yc.datasynchronization.service.detentionhousecs.service.DetentionCSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetentionCSServiceImpl implements DetentionCSService {


    @Autowired
    private DetentionCSMapper detentionCSMapper;

    @Override
    @Transactional(transactionManager = "detentionCSTransactionManager")
    public List<SLshjxxb> getCSLshjxxb(String hj) {
        return detentionCSMapper.getCSLshjxxb(hj);
    }

    @Override
    @Transactional(transactionManager = "detentionCSTransactionManager")
    public List<SRybdxxb> getCSRsrq() {
        return detentionCSMapper.getCSRsrq();
    }

    @Override
    @Transactional(transactionManager = "detentionCSTransactionManager")
    public List<SYljlb> getCSYljib(String yl) {
        return detentionCSMapper.getCSYljib(yl);
    }

    @Override
    @Transactional(transactionManager = "detentionCSTransactionManager")
    public List<STjcsdj> getCSTjcsdj(String ty) {
        return detentionCSMapper.getCSTjcsdj(ty);
    }
}
