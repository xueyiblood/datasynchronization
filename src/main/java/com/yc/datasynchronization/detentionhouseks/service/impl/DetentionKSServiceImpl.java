package com.yc.datasynchronization.detentionhouseks.service.impl;

import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
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
    public List<SLshjxxb> getKSLshjxxb() {
        return detentionKSMapper.getKSLshjxxb();
    }
}
