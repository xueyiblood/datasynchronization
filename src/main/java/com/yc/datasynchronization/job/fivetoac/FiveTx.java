package com.yc.datasynchronization.job.fivetoac;

import com.yc.datasynchronization.service.actual.service.ActualService;
import com.yc.datasynchronization.service.detentionhousecs.service.DetentionCSService;
import com.yc.datasynchronization.service.detentionhouseks.service.DetentionKSService;
import com.yc.datasynchronization.service.detentionhousetc.service.DetentionTCService;
import com.yc.datasynchronization.service.detentionhousewj.service.DetentionWJService;
import com.yc.datasynchronization.service.detentionhousezjg.service.DetentionZJGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FiveTx {

    @Autowired
    private DetentionCSService detentionCSService;

    @Autowired
    private DetentionTCService detentionTCService;

    @Autowired
    private DetentionWJService detentionWJService;

    @Autowired
    private DetentionKSService detentionKSService;

    @Autowired
    private DetentionZJGService detentionZJGService;
    @Autowired
    private ActualService actualService;
}
