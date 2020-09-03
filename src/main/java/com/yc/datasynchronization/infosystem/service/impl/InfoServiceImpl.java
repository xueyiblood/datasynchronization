package com.yc.datasynchronization.infosystem.service.impl;

import com.yc.datasynchronization.infosystem.entity.UserInfo;
import com.yc.datasynchronization.infosystem.mapper.InfoMapper;
import com.yc.datasynchronization.infosystem.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("InfoService")
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    @Transactional(transactionManager = "infoTransactionManager")
    public List<UserInfo> getInfoUser() {
        List<UserInfo> users = infoMapper.getInfoUser();
        return users;
    }
}
