package com.yc.datasynchronization.detentionhousewj.service;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;

import java.util.List;

public interface DetentionWJService {
    List<SLshjxxb> getWJLshjxxb(String hj);

    List<SRybdxxb> getWJRsrq();

    List<SYljlb> getWJYljib(String yl);

    List<STjcsdj> getWJTjcsdj(String ty);
}
