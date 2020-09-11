package com.yc.datasynchronization.infosystem.service;


import com.yc.datasynchronization.infosystem.entity.Lshjxx;
import com.yc.datasynchronization.infosystem.entity.Rybdxx;
import com.yc.datasynchronization.infosystem.entity.Ryjbxx;
import com.yc.datasynchronization.infosystem.entity.Zpb;


import java.util.List;


public interface InfoService {

    List<Ryjbxx> getInfoRyjbxxb(String jsbh);

    List<Rybdxx> getInfoRybdxxb(String rybh);

    Zpb getInfoZpb(String rybh);

    List<Lshjxx> getInfoLshjxxb(String jsbh,String key);

    List<Rybdxx> getInfoRsrq(String jsbh);


}
