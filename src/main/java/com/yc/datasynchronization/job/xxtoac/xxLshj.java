package com.yc.datasynchronization.job.xxtoac;

import com.yc.datasynchronization.actual.entity.LshjxxbKss;
import com.yc.datasynchronization.actual.entity.TjcsdjKss;
import com.yc.datasynchronization.actual.service.ActualService;
import com.yc.datasynchronization.infosystem.entity.Lshjxx;
import com.yc.datasynchronization.infosystem.entity.Tjcsdj;
import com.yc.datasynchronization.infosystem.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class xxLshj {
    @Autowired
    private InfoService infoService;

    @Autowired
    private ActualService actualService;


    //律师会见 信息-实战
    public void infoAndActualLshj(String hj) {
        String[] str = new String[4];
        str[0] = "320500111";
        str[1] = "320500112";
        str[2] = "320500113";
        str[3] = "320500114";
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//注意月份是MM
        Date djrq = null;
        try {
            djrq = s.parse("1900-01-01 00:00:00");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < str.length; i++) {
            try {

                List<Lshjxx> listInfoLshj = infoService.getInfoLshjxxb(str[i], hj);
                System.out.println(i + "看");
                for (int j = 0; j < listInfoLshj.size(); j++) {
                    Lshjxx infoLshjxx = listInfoLshj.get(j);
                    LshjxxbKss actualLshjxx1 = new LshjxxbKss();
                    actualLshjxx1.setRybh(infoLshjxx.getRybh());
                    actualLshjxx1.setHjkssj(infoLshjxx.getHjkssj());
                    actualLshjxx1.setHjjssj(infoLshjxx.getHjjssj());
                    if (infoLshjxx.getLsdw() == null) {
                        actualLshjxx1.setLsdw("");
                    } else {
                        actualLshjxx1.setLsdw(infoLshjxx.getLsdw());
                    }
                    actualLshjxx1.setJsbh(infoLshjxx.getZyjsbh());
                    if (infoLshjxx.getTcry() == null) {
                        actualLshjxx1.setTcry("");
                    } else {
                        actualLshjxx1.setTcry(infoLshjxx.getTcry());
                    }
                    if (infoLshjxx.getThry() == null) {
                        actualLshjxx1.setThry("");
                    } else {
                        actualLshjxx1.setThry(infoLshjxx.getThry());
                    }
                    actualLshjxx1.setCzsjc(infoLshjxx.getCzsjc());
                    if (infoLshjxx.getLsxm() == null) {
                        actualLshjxx1.setLsxm("");
                    } else {
                        actualLshjxx1.setLsxm(infoLshjxx.getLsxm());
                    }
                    List<LshjxxbKss> listActualLshjxx = actualService.getActualLshj(actualLshjxx1);
                    if (null == listActualLshjxx || listActualLshjxx.size() == 0) {
                        LshjxxbKss actualLshjxx2 = new LshjxxbKss();
                        actualLshjxx2.setZybh(infoLshjxx.getZybh());
                        actualLshjxx2.setRybh(infoLshjxx.getRybh());
                        if (infoLshjxx.getLsxm() == null) {
                            actualLshjxx2.setLsxm("");
                        } else {
                            actualLshjxx2.setLsxm(infoLshjxx.getLsxm());
                        }
                        actualLshjxx2.setLszjh(infoLshjxx.getLszjh());
                        actualLshjxx2.setRs(infoLshjxx.getRs());
                        actualLshjxx2.setPzr(infoLshjxx.getPzr());
                        actualLshjxx2.setGznr(infoLshjxx.getGznr());
                        actualLshjxx2.setHjs(infoLshjxx.getHjs());
                        if (infoLshjxx.getTcry() == null) {
                            actualLshjxx2.setTcry("");
                        } else {
                            actualLshjxx2.setTcry(infoLshjxx.getTcry());
                        }
                        if (infoLshjxx.getThry() == null) {
                            actualLshjxx2.setThry("");
                        } else {
                            actualLshjxx2.setThry(infoLshjxx.getThry());
                        }
                        actualLshjxx2.setJdmj(infoLshjxx.getJdmj());
                        actualLshjxx2.setHjkssj(infoLshjxx.getHjkssj());
                        actualLshjxx2.setHjjssj(infoLshjxx.getHjjssj());
                        if (infoLshjxx.getLsdw() == null) {
                            actualLshjxx2.setLsdw("");
                        } else {
                            actualLshjxx2.setLsdw(infoLshjxx.getLsdw());
                        }
                        if (infoLshjxx.getWtr() == null) {
                            actualLshjxx2.setWtr("");
                        } else {
                            actualLshjxx2.setWtr(infoLshjxx.getWtr());
                        }
                        actualLshjxx2.setFaccode(infoLshjxx.getFaccode());
                        if (infoLshjxx.getWjqrcssj() == null) {
                            actualLshjxx2.setWjqrcssj(djrq);
                        } else {
                            actualLshjxx2.setWjqrcssj(infoLshjxx.getWjqrcssj());
                        }
                        actualLshjxx2.setWjqrhssj(infoLshjxx.getWjqrhssj());
                        actualLshjxx2.setDcry(infoLshjxx.getDcry());
                        actualLshjxx2.setDhry(infoLshjxx.getDhry());
                        actualLshjxx2.setCzsjc(infoLshjxx.getCzsjc());
                        actualLshjxx2.setJsbh(infoLshjxx.getZyjsbh());
                        actualLshjxx2.setSybjl(infoLshjxx.getSybjl());
                        actualService.insActualLshj(actualLshjxx2);
                        System.out.println("律师新增:" + infoLshjxx.getRybh());
                    } else {
                        System.out.println("律师去重:" + infoLshjxx.getRybh());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
