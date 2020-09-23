package com.yc.datasynchronization.infosystem.service;


import com.yc.datasynchronization.infosystem.entity.*;


import java.util.List;


public interface InfoService {

    List<Ryjbxx> getInfoRyjbxxb(String jsbh);

    List<Rybdxx> getInfoRybdxxb(String rybh);

    Zpb getInfoZpb(String rybh);

    List<Lshjxx> getInfoLshjxxb(String jsbh,String key);

    List<Rybdxx> getInfoRsrq(String jsbh);

    List<Yljlb> getInfoYljib(String jsbh,String yl);

    List<Tjcsdj> getInfoTjcsdj(String jsbh,String ty);

    List<Txxxb> getInfoTxxxb(String jsbh, String tx);


}
