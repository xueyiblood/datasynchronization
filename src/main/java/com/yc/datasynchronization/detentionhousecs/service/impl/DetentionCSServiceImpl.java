package com.yc.datasynchronization.detentionhousecs.service.impl;

import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.mapper.DetentionCSMapper;
import com.yc.datasynchronization.detentionhousecs.service.DetentionCSService;
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
    public List<SLshjxxb> getCSLshjxxb() {
        return detentionCSMapper.getCSLshjxxb();
    }
}
