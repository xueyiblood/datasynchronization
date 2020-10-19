package com.yc.datasynchronization.service.actual.service;



import com.yc.datasynchronization.service.actual.entity.*;
import com.yc.datasynchronization.service.infosystem.entity.*;


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

    List<YljlbKss> getActualSnyl(YljlbKss yljlbKss);

    int insActualSnyl(YljlbKss yljlbKss);

    List<TjcsdjKss> getActualTy(TjcsdjKss tjcsdjKss);

    int insActualTy(TjcsdjKss tjcsdjKss);

    List<TxxxbKss> getActualTx(TxxxbKss txxxbKss);

    int insActualTx(TxxxbKss txxxbKss);

}
