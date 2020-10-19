package com.yc.datasynchronization.service.detentionhousecs.service;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhousecs.entity.*;

import java.util.List;

public interface DetentionCSService {
    List<SLshjxxb> getCSLshjxxb(String hj);

    List<SRybdxxb> getCSRsrq();

    List<SYljlb> getCSYljib(String yl);

    List<STjcsdj> getCSTjcsdj(String ty);
}
