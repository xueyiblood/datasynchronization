package com.yc.datasynchronization.service.detentionhouse4.service;

import com.yc.datasynchronization.service.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.service.detentionhouse1.entity.SZpb;

import java.util.List;

public interface Detention4Service {

    List<SRyjbxxb> getDt4Ryjbxxb(String rybh);

    List<SRybdxxb> getDt4Rybdxxb(String rybh);

    List<SZpb> getDt4Zpb(String rybh);

    int delDt4Zpb(String rybh);

    int insDt4Zpb (SZpb zpb);

    int updDt4Ryjbxxb(SRyjbxxb ryjbxx);

    int insDt4Ryjbxxb(SRyjbxxb ryjbxx);


    int delDt4Rybdxxb(String rybh);

    int insDt4Rybdxxb(SRybdxxb rybdxx);
}
