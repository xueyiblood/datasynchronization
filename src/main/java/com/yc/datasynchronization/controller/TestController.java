package com.yc.datasynchronization.controller;

import com.yc.datasynchronization.detentionhouse.mapper.DetentionMapper;
import com.yc.datasynchronization.detentionhouse.service.DetentionService;
import com.yc.datasynchronization.infosystem.entity.UserInfo;
import com.yc.datasynchronization.infosystem.mapper.InfoMapper;
import com.yc.datasynchronization.infosystem.service.InfoService;
import com.yc.datasynchronization.infosystem.service.impl.InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/getInfoUser")
    public Integer getInfoUser() {
        List<UserInfo> infoUser1 = infoService.getInfoUser();
        return 1;
    }


    @GetMapping("/getDetentionUser")
    public Integer getDetentionUser() {
        return detentionService.getDetentionUser();
    }
}
