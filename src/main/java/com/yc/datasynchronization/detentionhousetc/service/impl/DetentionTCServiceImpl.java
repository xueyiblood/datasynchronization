package com.yc.datasynchronization.detentionhousetc.service.impl;

import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousetc.mapper.DetentionTCMapper;
import com.yc.datasynchronization.detentionhousetc.service.DetentionTCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetentionTCServiceImpl implements DetentionTCService {


    @Autowired
    private DetentionTCMapper detentionTCMapper;

    @Override
    @Transactional(transactionManager = "detentionTCTransactionManager")
    public List<SLshjxxb> getTCLshjxxb() {
        return detentionTCMapper.getTCLshjxxb();
    }
}
