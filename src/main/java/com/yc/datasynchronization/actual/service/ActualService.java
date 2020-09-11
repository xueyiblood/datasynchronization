package com.yc.datasynchronization.actual.service;



import com.yc.datasynchronization.actual.entity.LshjxxbKss;
import com.yc.datasynchronization.actual.entity.RybdxxbKss;
import com.yc.datasynchronization.actual.entity.RyjbxxbKss;
import com.yc.datasynchronization.actual.entity.ZpbKss;
import com.yc.datasynchronization.infosystem.entity.Zpb;


import java.util.Date;
import java.util.List;


public interface ActualService {

    List<RyjbxxbKss> getActualRyjbxxb(String rybh);

    List<RybdxxbKss> getActualRybdxxb(String rybh);

    List<Zpb> getActualZpb(String rybh);

    int updActualZpb (Zpb zpb);

    int insActualZpb (ZpbKss zpb);

    int updActualRyjbxxb(RyjbxxbKss ryjbxx);


    int insActualRyjbxxb(RyjbxxbKss ryjbxx);

    int delActualRybdxxb(String rybh);


    int insActualRybdxxb(RybdxxbKss rybdxx);

    int delActualZpb(String rybh);

    List<LshjxxbKss> getActualLshj(LshjxxbKss lshjxxbKss);

    int insActualLshj(LshjxxbKss lshjxxbKss);

    int upaActualRybdxxRsrq(String rybh, Date rsrq);


}
