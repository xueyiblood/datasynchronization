package com.yc.datasynchronization.detentionhouse3.service;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SZpb;

import java.util.List;

public interface Detention3Service {

    List<SRyjbxxb> getDt3Ryjbxxb(String rybh);

    List<SRybdxxb> getDt3Rybdxxb(String rybh);

    List<SZpb> getDt3Zpb(String rybh);

    int delDt3Zpb(String rybh);

    int insDt3Zpb (SZpb zpb);

    int updDt3Ryjbxxb(SRyjbxxb ryjbxx);

    int insDt3Ryjbxxb(SRyjbxxb ryjbxx);


    int delDt3Rybdxxb(String rybh);

    int insDt3Rybdxxb(SRybdxxb rybdxx);
}
