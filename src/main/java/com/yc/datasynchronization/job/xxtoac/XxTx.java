package com.yc.datasynchronization.job.xxtoac;

import com.yc.datasynchronization.actual.entity.TxxxbKss;
import com.yc.datasynchronization.actual.service.ActualService;
import com.yc.datasynchronization.infosystem.entity.Txxxb;
import com.yc.datasynchronization.infosystem.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class XxTx {
    @Autowired
    private InfoService infoService;

    @Autowired
    private ActualService actualService;
    //提审
    public void infoAndActualTx(String tx) {
        String[] str = new String[4];
        str[0] = "320500111";
        str[1] = "320500112";
        str[2] = "320500113";
        str[3] = "320500114";
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//注意月份是MM
        Date rq = null;
        try {
            rq = s.parse("1900-01-01 00:00:00");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < str.length; i++) {
            try {
                List<Txxxb> infoTxxxb = infoService.getInfoTxxxb(str[i], tx);
                System.out.println(str[i] + ":" + infoTxxxb.size());
                for (Txxxb infoTx : infoTxxxb) {
                    TxxxbKss txxxbKss1 = new TxxxbKss();
                    txxxbKss1.setRybh(infoTx.getRybh());
                    if (infoTx.getBadw() == null) {
                        txxxbKss1.setBadw("");
                    } else {
                        txxxbKss1.setBadw(infoTx.getBadw());
                    }

                    if (infoTx.getBar() == null) {
                        txxxbKss1.setBar("");
                    } else {
                        txxxbKss1.setBar(infoTx.getBar());
                    }

                    if (infoTx.getDebar() == null) {
                        txxxbKss1.setDebar("");
                    } else {
                        txxxbKss1.setDebar(infoTx.getDebar());
                    }
                    txxxbKss1.setTxkssj(infoTx.getTxkssj());
                    txxxbKss1.setTxjssj(infoTx.getTxjssj());
                    if (infoTx.getCzsjc() == null) {
                        txxxbKss1.setCzsjc("");
                    } else {
                        txxxbKss1.setCzsjc(infoTx.getCzsjc());
                    }
                    txxxbKss1.setJsbh(infoTx.getZyjsbh());
                    List<TxxxbKss> list = actualService.getActualTx(txxxbKss1);
//                    List<TxxxbKss>  list=new ArrayList<>();
                    if (null == list || list.size() == 0) {
                        TxxxbKss txxxbKss2 = new TxxxbKss();
                        txxxbKss2.setZybh(infoTx.getZybh());
                        txxxbKss2.setRybh(infoTx.getRybh());
                        if (infoTx.getBadw() == null) {
                            txxxbKss2.setBadw("");
                        } else {
                            txxxbKss2.setBadw(infoTx.getBadw());
                        }

                        if (infoTx.getBar() == null) {
                            txxxbKss2.setBar("");
                        } else {
                            txxxbKss2.setBar(infoTx.getBar());
                        }

                        if (infoTx.getDebar() == null) {
                            txxxbKss2.setDebar("");
                        } else {
                            txxxbKss2.setDebar(infoTx.getDebar());
                        }
                        txxxbKss2.setTxkssj(infoTx.getTxkssj());
                        txxxbKss2.setTxjssj(infoTx.getTxjssj());
                        if (infoTx.getCzsjc() == null) {
                            txxxbKss2.setCzsjc("");
                        } else {
                            txxxbKss2.setCzsjc(infoTx.getCzsjc());
                        }
                        txxxbKss2.setJsbh(infoTx.getZyjsbh());
                        txxxbKss2.setBz(infoTx.getBz());
                        txxxbKss2.setDcry(infoTx.getDcry());
                        txxxbKss2.setDhry(infoTx.getDhry());
                        txxxbKss2.setJdmj(infoTx.getJdmj());
                        txxxbKss2.setZjhm(infoTx.getZjhm());
                        txxxbKss2.setSz(infoTx.getSz());
                        txxxbKss2.setSzqzrq(infoTx.getSzqzrq());
                        txxxbKss2.setSzyj(infoTx.getSzyj());
                        txxxbKss2.setTcry(infoTx.getTcry());
                        txxxbKss2.setThry(infoTx.getThry());
                        txxxbKss2.setTcryid(infoTx.getTcryid());
                        txxxbKss2.setThryid(infoTx.getThryid());
                        txxxbKss2.setSybjl(infoTx.getSybjl());
                        txxxbKss2.setFaccode(infoTx.getFaccode());
                        txxxbKss2.setWjqrcssj(infoTx.getWjqrcssj());
                        if (infoTx.getWjqrhssj() == null) {
                            txxxbKss2.setWjqrhssj(rq);
                        } else {
                            txxxbKss2.setWjqrhssj(infoTx.getWjqrhssj());
                        }

                        txxxbKss2.setTxdd(infoTx.getTxdd());
                        txxxbKss2.setXway(infoTx.getXway());
                        txxxbKss2.setDebarzj(infoTx.getDebarzj());
                        txxxbKss2.setTcryid(infoTx.getTcryid());
                        txxxbKss2.setThryid(infoTx.getThryid());
                        txxxbKss2.setJdmjid(infoTx.getJdmjid());
                        txxxbKss2.setJsxbh(infoTx.getJsxbh());
                        if (txxxbKss2.getSybjl() != null && txxxbKss2.getSybjl().getYear() < 0) {
                            txxxbKss2.setSybjl(rq);
                        }
                        if (txxxbKss2.getSybjl() != null && txxxbKss2.getSzqzrq().getYear() < 0) {
                            txxxbKss2.setSzqzrq(rq);
                        }
                        infoAndActualTxAdd(txxxbKss2);
                        System.out.println("提审新增:" + infoTx.getRybh());
                    } else {
                        System.out.println("提审去重:" + infoTx.getRybh());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void infoAndActualTxAdd(TxxxbKss txxxbKss2) {
        try {
            actualService.insActualTx(txxxbKss2);

        } catch (Exception ex) {
            System.out.println("提审新增ERR:" + txxxbKss2.getRybh());
        }
    }
}
