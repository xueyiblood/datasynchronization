package com.yc.datasynchronization.detentionhousetc.service;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetentionTCService {
    List<SLshjxxb> getTCLshjxxb(String hj);

    List<SRybdxxb> getTCRsrq();

    List<SYljlb> getTCYljib(String yl);

    List<STjcsdj> getTCTjcsdj(String ty);

}
