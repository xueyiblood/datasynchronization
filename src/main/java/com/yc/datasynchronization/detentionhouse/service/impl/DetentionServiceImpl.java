package com.yc.datasynchronization.detentionhouse.service.impl;

import com.yc.datasynchronization.detentionhouse.mapper.DetentionMapper;
import com.yc.datasynchronization.detentionhouse.service.DetentionService;
import com.yc.datasynchronization.infosystem.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetentionServiceImpl implements DetentionService {

    @Autowired
    DetentionMapper detentionMapper;

    @Override
    @Transactional(transactionManager = "detentionTransactionManager")
    public Integer getDetentionUser() {
        List<UserInfo> users =  detentionMapper.getDetentionUser();
        return 1;
    }
}
