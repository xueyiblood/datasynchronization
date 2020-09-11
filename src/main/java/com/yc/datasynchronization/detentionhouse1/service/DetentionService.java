package com.yc.datasynchronization.detentionhouse1.service;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SZpb;

import java.util.List;

public interface DetentionService {

    List<SRyjbxxb> getDt1Ryjbxxb(String rybh);

    List<SRybdxxb> getDt1Rybdxxb(String rybh);

    List<SZpb> getDt1Zpb(String rybh);

    int delDt1Zpb(String rybh);

    int insDt1Zpb (SZpb zpb);

    int updDt1Ryjbxxb(SRyjbxxb ryjbxx);

    int insDt1Ryjbxxb(SRyjbxxb ryjbxx);


    int delDt1Rybdxxb(String rybh);

    int insDt1Rybdxxb(SRybdxxb rybdxx);


}
