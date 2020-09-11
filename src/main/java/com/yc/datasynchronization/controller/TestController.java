package com.yc.datasynchronization.controller;

import com.yc.datasynchronization.detentionhouse1.mapper.DetentionMapper;
import com.yc.datasynchronization.detentionhouse1.service.DetentionService;
import com.yc.datasynchronization.infosystem.mapper.InfoMapper;
import com.yc.datasynchronization.infosystem.service.InfoService;
import com.yc.datasynchronization.infosystem.service.impl.InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    // 多数据源
    @Autowired
    private InfoService infoService;
    @Autowired
    private InfoServiceImpl infoServiceImpl;
    @Autowired
    private DetentionService detentionService;

    @Autowired
    private InfoMapper infoMapper;
    @Autowired
    private DetentionMapper detentionMapper;

}
