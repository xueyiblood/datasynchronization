package com.yc.datasynchronization.job.fivetoac;

import com.yc.datasynchronization.service.actual.entity.LshjxxbKss;
import com.yc.datasynchronization.service.actual.service.ActualService;
import com.yc.datasynchronization.service.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.service.detentionhousecs.service.DetentionCSService;
import com.yc.datasynchronization.service.detentionhouseks.service.DetentionKSService;
import com.yc.datasynchronization.service.detentionhousetc.service.DetentionTCService;
import com.yc.datasynchronization.service.detentionhousewj.service.DetentionWJService;
import com.yc.datasynchronization.service.detentionhousezjg.service.DetentionZJGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FiveLshj {
    @Autowired
    private DetentionCSService detentionCSService;

    @Autowired
    private DetentionTCService detentionTCService;

    @Autowired
    private DetentionWJService detentionWJService;

    @Autowired
    private DetentionKSService detentionKSService;

    @Autowired
    private DetentionZJGService detentionZJGService;
    @Autowired
    private ActualService actualService;


    //律师会见 常熟-实战
    public void csAndActualLshj1(String hj) {
        List<SLshjxxb> listCSLshj = detentionCSService.getCSLshjxxb(hj);
        for (int i = 0; i < listCSLshj.size(); i++) {
            String infoRybh = listCSLshj.get(i).getRybh();
            SLshjxxb sLshjxx = listCSLshj.get(i);
            LshjxxbKss actualLshjxx1 = new LshjxxbKss();
            actualLshjxx1.setRybh(infoRybh);
            actualLshjxx1.setHjkssj(sLshjxx.getHjkssj());
            actualLshjxx1.setHjjssj(sLshjxx.getHjjssj());
            actualLshjxx1.setLsdw(sLshjxx.getLsdw());
            actualLshjxx1.setWtr(sLshjxx.getWtr());
            List<LshjxxbKss> listActualLshjxx = actualService.getActualLshj(actualLshjxx1);
            if (listActualLshjxx == null && listActualLshjxx.isEmpty()) {
                LshjxxbKss actualLshjxx2 = new LshjxxbKss();
                actualLshjxx2.setZybh(sLshjxx.getZybh());
                actualLshjxx2.setRybh(infoRybh);
                actualLshjxx2.setLsxm(sLshjxx.getLsxm());
                actualLshjxx2.setLszjh(sLshjxx.getLszjh());
                actualLshjxx2.setRs(sLshjxx.getRs());
                actualLshjxx2.setPzr(sLshjxx.getPzr());
                actualLshjxx2.setGznr(sLshjxx.getGznr());
                actualLshjxx2.setHjs(sLshjxx.getHjs());
                actualLshjxx2.setTcry(sLshjxx.getTcry());
                actualLshjxx2.setThry(sLshjxx.getThry());
                actualLshjxx2.setJdmj(sLshjxx.getJdmj());
                actualLshjxx2.setHjkssj(sLshjxx.getHjkssj());
                actualLshjxx2.setHjjssj(sLshjxx.getHjjssj());
                actualLshjxx2.setLsdw(sLshjxx.getLsdw());
                actualLshjxx2.setWtr(sLshjxx.getWtr());
                actualLshjxx2.setFaccode(sLshjxx.getFaccode());
                actualLshjxx2.setWjqrcssj(sLshjxx.getWjqrcssj());
                actualLshjxx2.setWjqrhssj(sLshjxx.getWjqrhssj());
                actualLshjxx2.setDcry(sLshjxx.getDcry());
                actualLshjxx2.setDhry(sLshjxx.getDhry());
                actualLshjxx2.setCzsjc(sLshjxx.getCzsjc());
                actualLshjxx2.setJsbh("320581111");
                actualService.insActualLshj(actualLshjxx2);
            }
        }
    }

    //律师会见 太仓-实战
    public void tcAndActualLshj2(String hj) {
        List<SLshjxxb> listTCLshj = detentionTCService.getTCLshjxxb(hj);
        for (int i = 0; i < listTCLshj.size(); i++) {
            String infoRybh = listTCLshj.get(i).getRybh();
            SLshjxxb sLshjxx = listTCLshj.get(i);
            LshjxxbKss actualLshjxx1 = new LshjxxbKss();
            actualLshjxx1.setRybh(infoRybh);
            actualLshjxx1.setHjkssj(sLshjxx.getHjkssj());
            actualLshjxx1.setHjjssj(sLshjxx.getHjjssj());
            actualLshjxx1.setLsdw(sLshjxx.getLsdw());
            actualLshjxx1.setWtr(sLshjxx.getWtr());
            List<LshjxxbKss> listActualLshjxx = actualService.getActualLshj(actualLshjxx1);
            if (listActualLshjxx == null && listActualLshjxx.isEmpty()) {
                LshjxxbKss actualLshjxx2 = new LshjxxbKss();
                actualLshjxx2.setZybh(sLshjxx.getZybh());
                actualLshjxx2.setRybh(infoRybh);
                actualLshjxx2.setLsxm(sLshjxx.getLsxm());
                actualLshjxx2.setLszjh(sLshjxx.getLszjh());
                actualLshjxx2.setRs(sLshjxx.getRs());
                actualLshjxx2.setPzr(sLshjxx.getPzr());
                actualLshjxx2.setGznr(sLshjxx.getGznr());
                actualLshjxx2.setHjs(sLshjxx.getHjs());
                actualLshjxx2.setTcry(sLshjxx.getTcry());
                actualLshjxx2.setThry(sLshjxx.getThry());
                actualLshjxx2.setJdmj(sLshjxx.getJdmj());
                actualLshjxx2.setHjkssj(sLshjxx.getHjkssj());
                actualLshjxx2.setHjjssj(sLshjxx.getHjjssj());
                actualLshjxx2.setLsdw(sLshjxx.getLsdw());
                actualLshjxx2.setWtr(sLshjxx.getWtr());
                actualLshjxx2.setFaccode(sLshjxx.getFaccode());
                actualLshjxx2.setWjqrcssj(sLshjxx.getWjqrcssj());
                actualLshjxx2.setWjqrhssj(sLshjxx.getWjqrhssj());
                actualLshjxx2.setDcry(sLshjxx.getDcry());
                actualLshjxx2.setDhry(sLshjxx.getDhry());
                actualLshjxx2.setCzsjc(sLshjxx.getCzsjc());
                actualLshjxx2.setJsbh("320585111");
                actualService.insActualLshj(actualLshjxx2);
            }
        }
    }

    //律师会见 吴江-实战
    public void wjAndActualLshj3(String hj) {
        List<SLshjxxb> listWJLshj = detentionWJService.getWJLshjxxb(hj);
        for (int i = 0; i < listWJLshj.size(); i++) {
            String infoRybh = listWJLshj.get(i).getRybh();
            SLshjxxb sLshjxx = listWJLshj.get(i);
            LshjxxbKss actualLshjxx1 = new LshjxxbKss();
            actualLshjxx1.setRybh(infoRybh);
            actualLshjxx1.setHjkssj(sLshjxx.getHjkssj());
            actualLshjxx1.setHjjssj(sLshjxx.getHjjssj());
            actualLshjxx1.setLsdw(sLshjxx.getLsdw());
            actualLshjxx1.setWtr(sLshjxx.getWtr());
            List<LshjxxbKss> listActualLshjxx = actualService.getActualLshj(actualLshjxx1);
            if (listActualLshjxx == null && listActualLshjxx.isEmpty()) {
                LshjxxbKss actualLshjxx2 = new LshjxxbKss();
                actualLshjxx2.setZybh(sLshjxx.getZybh());
                actualLshjxx2.setRybh(infoRybh);
                actualLshjxx2.setLsxm(sLshjxx.getLsxm());
                actualLshjxx2.setLszjh(sLshjxx.getLszjh());
                actualLshjxx2.setRs(sLshjxx.getRs());
                actualLshjxx2.setPzr(sLshjxx.getPzr());
                actualLshjxx2.setGznr(sLshjxx.getGznr());
                actualLshjxx2.setHjs(sLshjxx.getHjs());
                actualLshjxx2.setTcry(sLshjxx.getTcry());
                actualLshjxx2.setThry(sLshjxx.getThry());
                actualLshjxx2.setJdmj(sLshjxx.getJdmj());
                actualLshjxx2.setHjkssj(sLshjxx.getHjkssj());
                actualLshjxx2.setHjjssj(sLshjxx.getHjjssj());
                actualLshjxx2.setLsdw(sLshjxx.getLsdw());
                actualLshjxx2.setWtr(sLshjxx.getWtr());
                actualLshjxx2.setFaccode(sLshjxx.getFaccode());
                actualLshjxx2.setWjqrcssj(sLshjxx.getWjqrcssj());
                actualLshjxx2.setWjqrhssj(sLshjxx.getWjqrhssj());
                actualLshjxx2.setDcry(sLshjxx.getDcry());
                actualLshjxx2.setDhry(sLshjxx.getDhry());
                actualLshjxx2.setCzsjc(sLshjxx.getCzsjc());
                actualLshjxx2.setJsbh("320584111");
                actualService.insActualLshj(actualLshjxx2);
            }
        }
    }

    //律师会见 张家港-实战
    public void zjgAndActualLshj4(String hj) {
        List<SLshjxxb> listZJGLshj = detentionZJGService.getZJGLshjxxb(hj);
        for (int i = 0; i < listZJGLshj.size(); i++) {
            String infoRybh = listZJGLshj.get(i).getRybh();
            SLshjxxb sLshjxx = listZJGLshj.get(i);
            LshjxxbKss actualLshjxx1 = new LshjxxbKss();
            actualLshjxx1.setRybh(infoRybh);
            actualLshjxx1.setHjkssj(sLshjxx.getHjkssj());
            actualLshjxx1.setHjjssj(sLshjxx.getHjjssj());
            actualLshjxx1.setLsdw(sLshjxx.getLsdw());
            actualLshjxx1.setWtr(sLshjxx.getWtr());
            List<LshjxxbKss> listActualLshjxx = actualService.getActualLshj(actualLshjxx1);
            if (listActualLshjxx == null && listActualLshjxx.isEmpty()) {
                LshjxxbKss actualLshjxx2 = new LshjxxbKss();
                actualLshjxx2.setZybh(sLshjxx.getZybh());
                actualLshjxx2.setRybh(infoRybh);
                actualLshjxx2.setLsxm(sLshjxx.getLsxm());
                actualLshjxx2.setLszjh(sLshjxx.getLszjh());
                actualLshjxx2.setRs(sLshjxx.getRs());
                actualLshjxx2.setPzr(sLshjxx.getPzr());
                actualLshjxx2.setGznr(sLshjxx.getGznr());
                actualLshjxx2.setHjs(sLshjxx.getHjs());
                actualLshjxx2.setTcry(sLshjxx.getTcry());
                actualLshjxx2.setThry(sLshjxx.getThry());
                actualLshjxx2.setJdmj(sLshjxx.getJdmj());
                actualLshjxx2.setHjkssj(sLshjxx.getHjkssj());
                actualLshjxx2.setHjjssj(sLshjxx.getHjjssj());
                actualLshjxx2.setLsdw(sLshjxx.getLsdw());
                actualLshjxx2.setWtr(sLshjxx.getWtr());
                actualLshjxx2.setFaccode(sLshjxx.getFaccode());
                actualLshjxx2.setWjqrcssj(sLshjxx.getWjqrcssj());
                actualLshjxx2.setWjqrhssj(sLshjxx.getWjqrhssj());
                actualLshjxx2.setDcry(sLshjxx.getDcry());
                actualLshjxx2.setDhry(sLshjxx.getDhry());
                actualLshjxx2.setCzsjc(sLshjxx.getCzsjc());
                actualLshjxx2.setJsbh("320582111");
                actualService.insActualLshj(actualLshjxx2);
            }
        }
    }

    //律师会见 昆山-实战
    public void ksAndActualLshj5(String hj) {
        List<SLshjxxb> listKSLshj = detentionKSService.getKSLshjxxb(hj);
        for (int i = 0; i < listKSLshj.size(); i++) {
            String infoRybh = listKSLshj.get(i).getRybh();
            SLshjxxb sLshjxx = listKSLshj.get(i);
            LshjxxbKss actualLshjxx1 = new LshjxxbKss();
            actualLshjxx1.setRybh(infoRybh);
            actualLshjxx1.setHjkssj(sLshjxx.getHjkssj());
            actualLshjxx1.setHjjssj(sLshjxx.getHjjssj());
            actualLshjxx1.setLsdw(sLshjxx.getLsdw());
            actualLshjxx1.setWtr(sLshjxx.getWtr());
            List<LshjxxbKss> listActualLshjxx = actualService.getActualLshj(actualLshjxx1);
            if (listActualLshjxx == null && listActualLshjxx.isEmpty()) {
                LshjxxbKss actualLshjxx2 = new LshjxxbKss();
                actualLshjxx2.setZybh(sLshjxx.getZybh());
                actualLshjxx2.setRybh(infoRybh);
                actualLshjxx2.setLsxm(sLshjxx.getLsxm());
                actualLshjxx2.setLszjh(sLshjxx.getLszjh());
                actualLshjxx2.setRs(sLshjxx.getRs());
                actualLshjxx2.setPzr(sLshjxx.getPzr());
                actualLshjxx2.setGznr(sLshjxx.getGznr());
                actualLshjxx2.setHjs(sLshjxx.getHjs());
                actualLshjxx2.setTcry(sLshjxx.getTcry());
                actualLshjxx2.setThry(sLshjxx.getThry());
                actualLshjxx2.setJdmj(sLshjxx.getJdmj());
                actualLshjxx2.setHjkssj(sLshjxx.getHjkssj());
                actualLshjxx2.setHjjssj(sLshjxx.getHjjssj());
                actualLshjxx2.setLsdw(sLshjxx.getLsdw());
                actualLshjxx2.setWtr(sLshjxx.getWtr());
                actualLshjxx2.setFaccode(sLshjxx.getFaccode());
                actualLshjxx2.setWjqrcssj(sLshjxx.getWjqrcssj());
                actualLshjxx2.setWjqrhssj(sLshjxx.getWjqrhssj());
                actualLshjxx2.setDcry(sLshjxx.getDcry());
                actualLshjxx2.setDhry(sLshjxx.getDhry());
                actualLshjxx2.setCzsjc(sLshjxx.getCzsjc());
                actualLshjxx2.setJsbh("320583111");
                actualService.insActualLshj(actualLshjxx2);
            }
        }
    }
}
