package com.yc.datasynchronization.detentionhouseks.service;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;

import java.util.List;


public interface DetentionKSService {
    List<SLshjxxb> getKSLshjxxb(String hj);

    List<SRybdxxb> getKSRsrq();

    List<SYljlb> getKSYljib(String yl);

    List<STjcsdj> getKSTjcsdj(String ty);

}
