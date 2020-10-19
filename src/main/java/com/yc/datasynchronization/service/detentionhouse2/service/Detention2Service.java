package com.yc.datasynchronization.service.detentionhouse2.service;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SZpb;

import java.util.List;

public interface Detention2Service {

    List<SRyjbxxb> getDt2Ryjbxxb(String rybh);

    List<SRybdxxb> getDt2Rybdxxb(String rybh);

    List<SZpb> getDt2Zpb(String rybh);

    int delDt2Zpb(String rybh);

    int insDt2Zpb (SZpb zpb);

    int updDt2Ryjbxxb(SRyjbxxb ryjbxx);

    int insDt2Ryjbxxb(SRyjbxxb ryjbxx);


    int delDt2Rybdxxb(String rybh);

    int insDt2Rybdxxb(SRybdxxb rybdxx);
}
