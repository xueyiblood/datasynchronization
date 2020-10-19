package com.yc.datasynchronization.service.detentionhousetc.service;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.service.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.service.detentionhousecs.entity.SYljlb;

import java.util.List;

public interface DetentionTCService {
    List<SLshjxxb> getTCLshjxxb(String hj);

    List<SRybdxxb> getTCRsrq();

    List<SYljlb> getTCYljib(String yl);

    List<STjcsdj> getTCTjcsdj(String ty);

}
