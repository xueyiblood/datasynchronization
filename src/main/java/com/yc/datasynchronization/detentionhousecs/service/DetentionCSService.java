package com.yc.datasynchronization.detentionhousecs.service;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;

import java.util.List;

public interface DetentionCSService {
    List<SLshjxxb> getCSLshjxxb(String hj);

    List<SRybdxxb> getCSRsrq();

    List<SYljlb> getCSYljib(String yl);

    List<STjcsdj> getCSTjcsdj(String ty);
}
