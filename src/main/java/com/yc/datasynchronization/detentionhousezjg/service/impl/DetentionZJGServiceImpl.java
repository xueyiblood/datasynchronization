package com.yc.datasynchronization.detentionhousezjg.service.impl;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;
import com.yc.datasynchronization.detentionhousezjg.mapper.DetentionZJGMapper;
import com.yc.datasynchronization.detentionhousezjg.service.DetentionZJGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetentionZJGServiceImpl implements DetentionZJGService {


    @Autowired
    private DetentionZJGMapper detentionZJGMapper;

    @Override
    @Transactional(transactionManager = "detentionZJGTransactionManager")
    public List<SLshjxxb> getZJGLshjxxb(String hj) {
        return detentionZJGMapper.getZJGLshjxxb(hj);
    }

    @Override
    @Transactional(transactionManager = "detentionZJGTransactionManager")
    public List<SRybdxxb> getZJGRsrq() {
        return detentionZJGMapper.getZJGRsrq();
    }

    @Override
    @Transactional(transactionManager = "detentionZJGTransactionManager")
    public List<SYljlb> getZJGYljib(String yl) {
        return detentionZJGMapper.getZJGYljib(yl);
    }

    @Override
    @Transactional(transactionManager = "detentionZJGTransactionManager")
    public List<STjcsdj> getZJGTjcsdj(String ty) {
        return detentionZJGMapper.getZJGTjcsdj(ty);
    }
}
