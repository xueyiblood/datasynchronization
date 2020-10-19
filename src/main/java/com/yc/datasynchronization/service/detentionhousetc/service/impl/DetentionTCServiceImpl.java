package com.yc.datasynchronization.service.detentionhousetc.service.impl;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.service.detentionhousecs.entity.*;
import com.yc.datasynchronization.service.detentionhousetc.mapper.DetentionTCMapper;
import com.yc.datasynchronization.service.detentionhousetc.service.*;
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
    public List<SLshjxxb> getTCLshjxxb(String hj) {
        return detentionTCMapper.getTCLshjxxb(hj);
    }

    @Override
    @Transactional(transactionManager = "detentionTCTransactionManager")
    public List<SRybdxxb> getTCRsrq() {
        return detentionTCMapper.getTCRsrq();
    }

    @Override
    @Transactional(transactionManager = "detentionTCTransactionManager")
    public List<SYljlb> getTCYljib(String yl) {
        return detentionTCMapper.getTCYljib(yl);
    }

    @Override
    @Transactional(transactionManager = "detentionTCTransactionManager")
    public List<STjcsdj> getTCTjcsdj(String ty) {
        return detentionTCMapper.getTCTjcsdj(ty);
    }
}
