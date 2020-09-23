package com.yc.datasynchronization.detentionhousezjg.service;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;

import java.util.List;

public interface DetentionZJGService {
    List<SLshjxxb> getZJGLshjxxb(String hj);

    List<SRybdxxb> getZJGRsrq();

    List<SYljlb> getZJGYljib(String yl);

    List<STjcsdj> getZJGTjcsdj(String ty);

}
