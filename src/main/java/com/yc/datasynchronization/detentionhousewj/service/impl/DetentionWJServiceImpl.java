package com.yc.datasynchronization.detentionhousewj.service.impl;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;
import com.yc.datasynchronization.detentionhousewj.mapper.DetentionWJMapper;
import com.yc.datasynchronization.detentionhousewj.service.DetentionWJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetentionWJServiceImpl implements DetentionWJService {


    @Autowired
    private DetentionWJMapper detentionWJMapper;

    @Override
    @Transactional(transactionManager = "detentionWJTransactionManager")
    public List<SLshjxxb> getWJLshjxxb(String hj) {
        return detentionWJMapper.getWJLshjxxb(hj);
    }

    @Override
    @Transactional(transactionManager = "detentionWJTransactionManager")
    public List<SRybdxxb> getWJRsrq() {
        return detentionWJMapper.getWJRsrq();
    }

    @Override
    @Transactional(transactionManager = "detentionWJTransactionManager")
    public List<SYljlb> getWJYljib(String yl) {
        return detentionWJMapper.getWJYljib(yl);
    }

    @Override
    public List<STjcsdj> getWJTjcsdj(String ty) {
        return detentionWJMapper.getWJTjcsdj(ty);
    }
}
