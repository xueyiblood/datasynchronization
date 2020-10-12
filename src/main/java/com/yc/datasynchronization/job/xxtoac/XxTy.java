package com.yc.datasynchronization.job.xxtoac;

import com.yc.datasynchronization.actual.entity.TjcsdjKss;
import com.yc.datasynchronization.actual.service.ActualService;
import com.yc.datasynchronization.infosystem.entity.Tjcsdj;
import com.yc.datasynchronization.infosystem.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class XxTy {
    @Autowired
    private InfoService infoService;

    @Autowired
    private ActualService actualService;
    //提押 信息-实战
    public void infoAndActualTy(String ty) {
        String[] str = new String[4];
        str[0] = "320500111";
        str[1] = "320500112";
        str[2] = "320500113";
        str[3] = "320500114";
        for (int i = 0; i < str.length; i++) {
            List<Tjcsdj> listInfoTjcsdj = infoService.getInfoTjcsdj(str[i], ty);
            for (int j = 0; j < listInfoTjcsdj.size(); j++) {
                try {
                    Tjcsdj infoTjcsdj = listInfoTjcsdj.get(j);
                    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//注意月份是MM
                    Date djrq = null;
                    try {
                        djrq = s.parse("1900-01-01 00:00:00");

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    TjcsdjKss actualTjcsdj1 = new TjcsdjKss();
                    if (infoTjcsdj.getDjrq() == null) {
                        actualTjcsdj1.setDjrq(djrq);
                    } else {
                        actualTjcsdj1.setDjrq(infoTjcsdj.getDjrq());
                    }
                    actualTjcsdj1.setRybh(infoTjcsdj.getRybh());
                    actualTjcsdj1.setCssj(infoTjcsdj.getCssj());
                    actualTjcsdj1.setHssj(infoTjcsdj.getHssj());
                    actualTjcsdj1.setCbdw(infoTjcsdj.getCbdw());
                    actualTjcsdj1.setCzsjc(infoTjcsdj.getCzsjc());
                    actualTjcsdj1.setJsbh(infoTjcsdj.getZyjsbh());
                    actualTjcsdj1.setCbr(infoTjcsdj.getCbr());
                    List<TjcsdjKss> list = actualService.getActualTy(actualTjcsdj1);
                    if (null == list || list.size() == 0) {
                        TjcsdjKss actualTjcsdj2 = new TjcsdjKss();
                        actualTjcsdj2.setZybh(infoTjcsdj.getZybh());
                        actualTjcsdj2.setRybh(infoTjcsdj.getRybh());
                        actualTjcsdj2.setCssj(infoTjcsdj.getCssj());
                        actualTjcsdj2.setHssj(infoTjcsdj.getHssj());
                        actualTjcsdj2.setCbdw(infoTjcsdj.getCbdw());
                        actualTjcsdj2.setCbr(infoTjcsdj.getCbr());
                        if (infoTjcsdj.getDjrq() == null) {
                            actualTjcsdj2.setDjrq(djrq);
                        } else {
                            actualTjcsdj2.setDjrq(infoTjcsdj.getDjrq());
                        }
                        actualTjcsdj2.setSsjd(infoTjcsdj.getSsjd());
                        actualTjcsdj2.setSy(infoTjcsdj.getSy());
                        actualTjcsdj2.setPzr(infoTjcsdj.getPzr());
                        actualTjcsdj2.setTcry(infoTjcsdj.getTcry());
                        actualTjcsdj2.setThry(infoTjcsdj.getThry());
                        if (infoTjcsdj.getBz() == null) {
                            actualTjcsdj2.setBz("");
                        } else {
                            actualTjcsdj2.setBz(infoTjcsdj.getBz());
                        }
                        actualTjcsdj2.setCzsjc(infoTjcsdj.getCzsjc());
                        actualTjcsdj2.setJsbh(infoTjcsdj.getZyjsbh());
                        actualService.insActualTy(actualTjcsdj2);
                        System.out.println("提押新增:" + infoTjcsdj.getRybh());
                    } else {
                        System.out.println("提押去重:" + infoTjcsdj.getRybh());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
