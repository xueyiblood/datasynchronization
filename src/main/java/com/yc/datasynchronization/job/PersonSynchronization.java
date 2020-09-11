package com.yc.datasynchronization.job;

import com.yc.datasynchronization.actual.entity.LshjxxbKss;
import com.yc.datasynchronization.actual.entity.RybdxxbKss;
import com.yc.datasynchronization.actual.entity.RyjbxxbKss;
import com.yc.datasynchronization.actual.entity.ZpbKss;
import com.yc.datasynchronization.actual.service.ActualService;
import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SZpb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.service.DetentionCSService;
import com.yc.datasynchronization.detentionhouseks.service.DetentionKSService;
import com.yc.datasynchronization.detentionhousetc.service.DetentionTCService;
import com.yc.datasynchronization.detentionhousewj.service.DetentionWJService;
import com.yc.datasynchronization.detentionhousezjg.service.DetentionZJGService;
import com.yc.datasynchronization.infosystem.entity.Lshjxx;
import com.yc.datasynchronization.infosystem.entity.Rybdxx;
import com.yc.datasynchronization.infosystem.entity.Ryjbxx;
import com.yc.datasynchronization.detentionhouse1.service.DetentionService;
import com.yc.datasynchronization.detentionhouse2.service.Detention2Service;
import com.yc.datasynchronization.detentionhouse3.service.Detention3Service;
import com.yc.datasynchronization.detentionhouse4.service.Detention4Service;
import com.yc.datasynchronization.infosystem.entity.Zpb;
import com.yc.datasynchronization.infosystem.service.InfoService;
import com.yc.datasynchronization.util.ConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class PersonSynchronization {

    /**
     * 注入三个数据库自己的service
     */
    @Autowired
    private InfoService infoService;


    @Autowired
    private ActualService actualService;

    @Autowired
    private DetentionService detentionService;

    @Autowired
    private Detention2Service detention2Service;

    @Autowired
    private Detention3Service detention3Service;

    @Autowired
    private Detention4Service detention4Service;

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

    /**
     * 每5分钟执行一次
     */
    @Scheduled(cron = "0 */1 * * * ?")
    public void personBasicInfoSynchronization(){

        //String key = ConfigUtil.getConfig("KEY");

        /**
         * 对比后丢入一二三四所
         */


        /**
         * 对比后丢入实战平台
         */
        //System.out.println("信息推送");
        //infoAndActual();

    }

    //信息-实战
    public  void  infoAndActual(){
        for (int i = 1; i <= 4; i++) {
            List<Ryjbxx> listInfoRyjbxxb = infoService.getInfoRyjbxxb("32050011"+i);

            for (int j = 0; j < listInfoRyjbxxb.size(); j++) {
                String infoRybh = listInfoRyjbxxb.get(j).getRybh();
                Ryjbxx infoRyjbxx = listInfoRyjbxxb.get(j);
                List<RyjbxxbKss> listActualRyjbxxb = actualService.getActualRyjbxxb(infoRybh);
                //赋值
                RyjbxxbKss actualRyjbxx = new RyjbxxbKss();
                actualRyjbxx.setRybh(infoRyjbxx.getRybh());
                actualRyjbxx.setJsbh(infoRyjbxx.getZyjsbh());
                actualRyjbxx.setBh(infoRyjbxx.getBh());
                actualRyjbxx.setXm(infoRyjbxx.getXm());
                actualRyjbxx.setMzxm(infoRyjbxx.getMzxm());
                actualRyjbxx.setBm(infoRyjbxx.getBm());
                actualRyjbxx.setXb(infoRyjbxx.getXb());
                actualRyjbxx.setCsrq(infoRyjbxx.getCsrq());
                actualRyjbxx.setZzmm(infoRyjbxx.getZzmm());
                actualRyjbxx.setZjlx(infoRyjbxx.getZjlx());
                actualRyjbxx.setZjhm(infoRyjbxx.getZjhm());
                actualRyjbxx.setHzh(infoRyjbxx.getHzh());
                actualRyjbxx.setHyzk(infoRyjbxx.getHyzk());
                actualRyjbxx.setMz(infoRyjbxx.getMz());
                actualRyjbxx.setGj(infoRyjbxx.getGj());
                actualRyjbxx.setJg(infoRyjbxx.getJg());
                actualRyjbxx.setZc(infoRyjbxx.getZc());
                actualRyjbxx.setWhcd(infoRyjbxx.getWhcd());
                actualRyjbxx.setZy(infoRyjbxx.getZy());
                actualRyjbxx.setGzdw(infoRyjbxx.getGzdw());
                actualRyjbxx.setZw(infoRyjbxx.getZw());
                actualRyjbxx.setSf(infoRyjbxx.getSf());
                actualRyjbxx.setTssf(infoRyjbxx.getTssf());
                actualRyjbxx.setHjszd(infoRyjbxx.getHjszd());
                actualRyjbxx.setHjdxz(infoRyjbxx.getHjdxz());
                actualRyjbxx.setXzzqh(infoRyjbxx.getXzzqh());
                actualRyjbxx.setXzzxz(infoRyjbxx.getXzzxz());
                actualRyjbxx.setDah(infoRyjbxx.getDah());
                actualRyjbxx.setZwbh(infoRyjbxx.getZwbh());
                actualRyjbxx.setBz(infoRyjbxx.getBz());
                actualRyjbxx.setJsh(infoRyjbxx.getJsh());
                actualRyjbxx.setGyqx(infoRyjbxx.getGyqx());
                actualRyjbxx.setRybj(infoRyjbxx.getRybj());
                actualRyjbxx.setPyzt(infoRyjbxx.getPyzt());
                actualRyjbxx.setCzr(infoRyjbxx.getCzr());
                actualRyjbxx.setSdrq(infoRyjbxx.getSdrq());
                actualRyjbxx.setFlwsh(infoRyjbxx.getFlwsh());
                actualRyjbxx.setHyrq(infoRyjbxx.getHyrq());
                actualRyjbxx.setSsjd(infoRyjbxx.getSsjd());
                actualRyjbxx.setBadw(infoRyjbxx.getBadw());
                actualRyjbxx.setBadwlx(infoRyjbxx.getBadwlx());
                actualRyjbxx.setBar(infoRyjbxx.getBar());
                actualRyjbxx.setClsj(infoRyjbxx.getClsj());
                actualRyjbxx.setCljg(infoRyjbxx.getCljg());
                actualRyjbxx.setXq(infoRyjbxx.getXq());
                actualRyjbxx.setXqksrq(infoRyjbxx.getXqksrq());
                actualRyjbxx.setXqjzrq(infoRyjbxx.getXqjzrq());
                actualRyjbxx.setFjcl(infoRyjbxx.getFjcl());
                actualRyjbxx.setFjclxq(infoRyjbxx.getFjclxq());
                actualRyjbxx.setSsrq(infoRyjbxx.getSsrq());
                actualRyjbxx.setZxrq(infoRyjbxx.getZxrq());
                actualRyjbxx.setFjje(infoRyjbxx.getFjje());
                actualRyjbxx.setHxxq(infoRyjbxx.getHxxq());
                actualRyjbxx.setSpz(infoRyjbxx.getSpz());
                actualRyjbxx.setBardh(infoRyjbxx.getBardh());
                actualRyjbxx.setWxdj(infoRyjbxx.getWxdj());
                actualRyjbxx.setFh(infoRyjbxx.getFh());
                actualRyjbxx.setCzsjc(infoRyjbxx.getCzsjc());
                actualRyjbxx.setJbxxlb(infoRyjbxx.getJbxxlb());
                actualRyjbxx.setStxxlb(infoRyjbxx.getStxxlb());
                actualRyjbxx.setZhxxlb(infoRyjbxx.getZhxxlb());
                actualRyjbxx.setJbxxzfs(infoRyjbxx.getJbxxzfs());
                actualRyjbxx.setStxxzfs(infoRyjbxx.getStxxzfs());
                actualRyjbxx.setZhxxzfs(infoRyjbxx.getZhxxzfs());
                actualRyjbxx.setRsqbx(infoRyjbxx.getRsqbx());
                actualRyjbxx.setRsqbxfs(infoRyjbxx.getRsqbxfs());
                actualRyjbxx.setSybjl(infoRyjbxx.getSybjl());
                if(listActualRyjbxxb != null && !listActualRyjbxxb.isEmpty()){
                    //修改
                    actualService.updActualRyjbxxb(actualRyjbxx);
                    //System.out.println("jb修改成功");
                }else {
                    //新增
                    actualService.insActualRyjbxxb(actualRyjbxx);
                    //System.out.println("jb新增成功");
                }

                List<RybdxxbKss> listActualRybdxxb = actualService.getActualRybdxxb(infoRybh);
                    //先删除数据，再新增
                if(listActualRybdxxb !=null && !listActualRybdxxb.isEmpty()){
                    actualService.delActualRybdxxb(infoRybh);
                    //System.out.println("bd删除成功");
                }
                List<Rybdxx> infoRybdxx = infoService.getInfoRybdxxb(infoRybh);
                RybdxxbKss actualRybdxx = new RybdxxbKss();
                actualRybdxx.setZybh(infoRybdxx.get(0).getZybh());
                actualRybdxx.setRybh(infoRybdxx.get(0).getRybh());
                actualRybdxx.setDbrq(infoRybdxx.get(0).getDbrq());
                actualRybdxx.setJlrq(infoRybdxx.get(0).getJlrq());
                actualRybdxx.setRsrq(infoRybdxx.get(0).getRsrq());
                actualRybdxx.setRsyy(infoRybdxx.get(0).getRsyy());
                actualRybdxx.setSypz(infoRybdxx.get(0).getSypz());
                actualRybdxx.setZldw(infoRybdxx.get(0).getZldw());
                actualRybdxx.setSydw(infoRybdxx.get(0).getSydw());
                actualRybdxx.setSyr(infoRybdxx.get(0).getSyr());
                actualRybdxx.setFlwsh(infoRybdxx.get(0).getCsflwsh());
                actualRybdxx.setBz(infoRybdxx.get(0).getBz());
                actualRybdxx.setWffzjl(infoRybdxx.get(0).getWffzjl());
                actualRybdxx.setCylb(infoRybdxx.get(0).getCylb());
                actualRybdxx.setAjlb(infoRybdxx.get(0).getAjlb());
                actualRybdxx.setJyaq(infoRybdxx.get(0).getJyaq());
                actualRybdxx.setZxf(infoRybdxx.get(0).getZxf());
                actualRybdxx.setRygllb(infoRybdxx.get(0).getRygllb());
                actualRybdxx.setBadw(infoRybdxx.get(0).getBadw());
                actualRybdxx.setPzrq(infoRybdxx.get(0).getPzrq());
                actualRybdxx.setPzdw(infoRybdxx.get(0).getPzdw());
                actualRybdxx.setPzr(infoRybdxx.get(0).getPzr());
                actualRybdxx.setCsrq(infoRybdxx.get(0).getCsrq());
                actualRybdxx.setCsyy(infoRybdxx.get(0).getCsyy());
                actualRybdxx.setCsqx(infoRybdxx.get(0).getCsqx());
                actualRybdxx.setJddw(infoRybdxx.get(0).getJddw());
                actualRybdxx.setDbr(infoRybdxx.get(0).getDbr());
                actualRybdxx.setDbryzyrgx(infoRybdxx.get(0).getDbryzyrgx());
                actualRybdxx.setDbrzz(infoRybdxx.get(0).getDbrzz());
                actualRybdxx.setDbrgzdw(infoRybdxx.get(0).getDbrgzdw());
                actualRybdxx.setSnbx(infoRybdxx.get(0).getSnbx());
                actualRybdxx.setHssj(infoRybdxx.get(0).getHssj());
                actualRybdxx.setJyrq(infoRybdxx.get(0).getJyrq());
                actualRybdxx.setWzbf(infoRybdxx.get(0).getWzbf());
                actualRybdxx.setFaccode(infoRybdxx.get(0).getWzbf());
                actualRybdxx.setCzsjc(infoRybdxx.get(0).getCzsjc());
                actualRybdxx.setJsbh(infoRybdxx.get(0).getZyjsbh());
                actualRybdxx.setSybjl(infoRybdxx.get(0).getSybjl());
                actualService.insActualRybdxxb(actualRybdxx);

                List<Zpb> listActualZpb = actualService.getActualZpb(infoRybh);
                Zpb zpbInfo = infoService.getInfoZpb(infoRybh);
                //System.out.println("bd新增成功");

                //先删除再新增
                ZpbKss zpbKss = new ZpbKss();
                zpbKss.setZybh(zpbInfo.getZybh());
                zpbKss.setRybh(zpbInfo.getRybh());
                zpbKss.setJsbh(zpbInfo.getZyjsbh());
                zpbKss.setCzsjc(zpbInfo.getCzsjc());
                zpbKss.setPic(zpbInfo.getPic());
                zpbKss.setSybjl(zpbInfo.getSybjl());

                if (listActualZpb != null && !listActualZpb.isEmpty()){
                    actualService.delActualZpb(infoRybh);
                   // System.out.println("zpb删除成功");
                }
                actualService.insActualZpb(zpbKss);
                //System.out.println("zpb新增成功");

            }
        }
    }

    //信息-一看
    public  void infoAndDetention1(){

            List<Ryjbxx> listInfoRyjbxxb = infoService.getInfoRyjbxxb("320500111");
            for (int i = 0; i < listInfoRyjbxxb.size(); i++) {
                String infoRybh = listInfoRyjbxxb.get(i).getRybh();
                Ryjbxx infoRyjbxx = listInfoRyjbxxb.get(i);
                //根据rybh查老一看ryjbxxb
                List<SRyjbxxb> listSRyjbxx = detentionService.getDt1Ryjbxxb(infoRybh);
                SRyjbxxb dt1Ryjbxx = new SRyjbxxb();
                dt1Ryjbxx.setRybh(infoRyjbxx.getRybh());
                dt1Ryjbxx.setJsbh(infoRyjbxx.getJsbh());
                dt1Ryjbxx.setBh(infoRyjbxx.getBh());
                dt1Ryjbxx.setXm(infoRyjbxx.getXm());
                dt1Ryjbxx.setMzxm(infoRyjbxx.getMzxm());
                dt1Ryjbxx.setBm(infoRyjbxx.getBm());
                dt1Ryjbxx.setXb(infoRyjbxx.getXb());
                dt1Ryjbxx.setCsrq(infoRyjbxx.getCsrq());
                dt1Ryjbxx.setZzmm(infoRyjbxx.getZzmm());
                dt1Ryjbxx.setZjlx(infoRyjbxx.getZjlx());
                dt1Ryjbxx.setZjhm(infoRyjbxx.getZjhm());
                dt1Ryjbxx.setHzh(infoRyjbxx.getHzh());
                dt1Ryjbxx.setHyzk(infoRyjbxx.getHyzk());
                dt1Ryjbxx.setMz(infoRyjbxx.getMz());
                dt1Ryjbxx.setGj(infoRyjbxx.getGj());
                dt1Ryjbxx.setJg(infoRyjbxx.getJg());
                dt1Ryjbxx.setZc(infoRyjbxx.getZc());
                dt1Ryjbxx.setWhcd(infoRyjbxx.getWhcd());
                dt1Ryjbxx.setZy(infoRyjbxx.getZy());
                dt1Ryjbxx.setGzdw(infoRyjbxx.getGzdw());
                dt1Ryjbxx.setZw(infoRyjbxx.getZw());
                dt1Ryjbxx.setSf(infoRyjbxx.getSf());
                dt1Ryjbxx.setTssf(infoRyjbxx.getTssf());
                dt1Ryjbxx.setHjszd(infoRyjbxx.getHjszd());
                dt1Ryjbxx.setHjdxz(infoRyjbxx.getHjdxz());
                dt1Ryjbxx.setXzzqh(infoRyjbxx.getXzzqh());
                dt1Ryjbxx.setXzzxz(infoRyjbxx.getXzzxz());
                dt1Ryjbxx.setDah(infoRyjbxx.getDah());
                dt1Ryjbxx.setZwbh(infoRyjbxx.getZwbh());
                dt1Ryjbxx.setBz(infoRyjbxx.getBz());
                dt1Ryjbxx.setJsh(infoRyjbxx.getJsh());
                dt1Ryjbxx.setGyqx(infoRyjbxx.getGyqx());
                dt1Ryjbxx.setRybj(infoRyjbxx.getRybj());
                dt1Ryjbxx.setPyzt(infoRyjbxx.getPyzt());
                dt1Ryjbxx.setCzr(infoRyjbxx.getCzr());
                dt1Ryjbxx.setSdrq(infoRyjbxx.getSdrq());
                dt1Ryjbxx.setFlwsh(infoRyjbxx.getFlwsh());
                dt1Ryjbxx.setHyrq(infoRyjbxx.getHyrq());
                dt1Ryjbxx.setSsjd(infoRyjbxx.getSsjd());
                dt1Ryjbxx.setBadw(infoRyjbxx.getBadw());
                dt1Ryjbxx.setBadwlx(infoRyjbxx.getBadwlx());
                dt1Ryjbxx.setBar(infoRyjbxx.getBar());
                dt1Ryjbxx.setClsj(infoRyjbxx.getClsj());
                dt1Ryjbxx.setCljg(infoRyjbxx.getCljg());
                dt1Ryjbxx.setXq(infoRyjbxx.getXq());
                dt1Ryjbxx.setXqksrq(infoRyjbxx.getXqksrq());
                dt1Ryjbxx.setXqjzrq(infoRyjbxx.getXqjzrq());
                dt1Ryjbxx.setFjcl(infoRyjbxx.getFjcl());
                dt1Ryjbxx.setFjclxq(infoRyjbxx.getFjclxq());
                dt1Ryjbxx.setSsrq(infoRyjbxx.getSsrq());
                dt1Ryjbxx.setZxrq(infoRyjbxx.getZxrq());
                dt1Ryjbxx.setFjje(infoRyjbxx.getFjje());
                dt1Ryjbxx.setHxxq(infoRyjbxx.getHxxq());
                dt1Ryjbxx.setSpz(infoRyjbxx.getSpz());
                dt1Ryjbxx.setBardh(infoRyjbxx.getBardh());
                dt1Ryjbxx.setWxdj(infoRyjbxx.getWxdj());
                dt1Ryjbxx.setFh(infoRyjbxx.getFh());
                dt1Ryjbxx.setCzsjc(infoRyjbxx.getCzsjc());
                dt1Ryjbxx.setJbxxlb(infoRyjbxx.getJbxxlb());
                dt1Ryjbxx.setStxxlb(infoRyjbxx.getStxxlb());
                dt1Ryjbxx.setZhxxlb(infoRyjbxx.getZhxxlb());
                dt1Ryjbxx.setJbxxzfs(infoRyjbxx.getJbxxzfs());
                dt1Ryjbxx.setStxxzfs(infoRyjbxx.getStxxzfs());
                dt1Ryjbxx.setZhxxzfs(infoRyjbxx.getZhxxzfs());
                dt1Ryjbxx.setRsqbx(infoRyjbxx.getRsqbx());
                dt1Ryjbxx.setRsqbxfs(infoRyjbxx.getRsqbxfs());
                dt1Ryjbxx.setYxlshj(infoRyjbxx.getYxlshj());

                if(listSRyjbxx != null && !listSRyjbxx.isEmpty()){
                    //修改
                    detentionService.updDt1Ryjbxxb(dt1Ryjbxx);
                }else {
                    //新增
                    detentionService.insDt1Ryjbxxb(dt1Ryjbxx);
                }
                //根据rybh查老一看rybdxxb
                List<SRybdxxb> listSRybdxx = detentionService.getDt1Rybdxxb(infoRybh);
                //先删除再新增
                detentionService.delDt1Rybdxxb(infoRybh);
                List<Rybdxx> infoRybdxx = infoService.getInfoRybdxxb(infoRybh);
                SRybdxxb dt1Rybdxx = new SRybdxxb();
                dt1Rybdxx.setRybh(infoRybdxx.get(0).getRybh());
                dt1Rybdxx.setDbrq(infoRybdxx.get(0).getDbrq());
                dt1Rybdxx.setJlrq(infoRybdxx.get(0).getJlrq());
                dt1Rybdxx.setRsrq(infoRybdxx.get(0).getRsrq());
                dt1Rybdxx.setRsyy(infoRybdxx.get(0).getRsyy());
                dt1Rybdxx.setSypz(infoRybdxx.get(0).getSypz());
                dt1Rybdxx.setZldw(infoRybdxx.get(0).getZldw());
                dt1Rybdxx.setSydw(infoRybdxx.get(0).getSydw());
                dt1Rybdxx.setSyr(infoRybdxx.get(0).getSyr());
                dt1Rybdxx.setFlwsh(infoRybdxx.get(0).getCsflwsh());
                dt1Rybdxx.setBz(infoRybdxx.get(0).getBz());
                dt1Rybdxx.setWffzjl(infoRybdxx.get(0).getWffzjl());
                dt1Rybdxx.setCylb(infoRybdxx.get(0).getCylb());
                dt1Rybdxx.setAjlb(infoRybdxx.get(0).getAjlb());
                dt1Rybdxx.setJyaq(infoRybdxx.get(0).getJyaq());
                dt1Rybdxx.setZxf(infoRybdxx.get(0).getZxf());
                dt1Rybdxx.setRygllb(infoRybdxx.get(0).getRygllb());
                dt1Rybdxx.setBadw(infoRybdxx.get(0).getBadw());
                dt1Rybdxx.setPzrq(infoRybdxx.get(0).getPzrq());
                dt1Rybdxx.setPzdw(infoRybdxx.get(0).getPzdw());
                dt1Rybdxx.setPzr(infoRybdxx.get(0).getPzr());
                dt1Rybdxx.setCsrq(infoRybdxx.get(0).getCsrq());
                dt1Rybdxx.setCsyy(infoRybdxx.get(0).getCsyy());
                dt1Rybdxx.setCsqx(infoRybdxx.get(0).getCsqx());
                dt1Rybdxx.setJddw(infoRybdxx.get(0).getJddw());
                dt1Rybdxx.setDbr(infoRybdxx.get(0).getDbr());
                dt1Rybdxx.setDbryzyrgx(infoRybdxx.get(0).getDbryzyrgx());
                dt1Rybdxx.setDbrzz(infoRybdxx.get(0).getDbrzz());
                dt1Rybdxx.setDbrgzdw(infoRybdxx.get(0).getDbrgzdw());
                dt1Rybdxx.setSnbx(infoRybdxx.get(0).getSnbx());
                dt1Rybdxx.setHssj(infoRybdxx.get(0).getHssj());
                dt1Rybdxx.setJyrq(infoRybdxx.get(0).getJyrq());
                dt1Rybdxx.setWzbf(infoRybdxx.get(0).getWzbf());
                dt1Rybdxx.setFaccode(infoRybdxx.get(0).getWzbf());
                dt1Rybdxx.setCzsjc(infoRybdxx.get(0).getCzsjc());
                dt1Rybdxx.setJsbh(infoRybdxx.get(0).getZyjsbh());
                dt1Rybdxx.setSybjl(infoRybdxx.get(0).getSybjl());
                detentionService.insDt1Rybdxxb(dt1Rybdxx);

                //根据rybh查老一看zpb
                List<SZpb> listSZpb = detentionService.getDt1Zpb(infoRybh);

                if(listSZpb != null && !listSZpb.isEmpty()){
                    //删除
                    detentionService.delDt1Zpb(infoRybh);
                }
                //新增
                SZpb sZpb = new SZpb();
                Zpb zpb =infoService.getInfoZpb(infoRybh);
                sZpb.setRybh(zpb.getRybh());
                sZpb.setZybh(zpb.getZybh());
                sZpb.setPic(zpb.getPic());
                sZpb.setCzsjc(zpb.getCzsjc());
                detentionService.insDt1Zpb(sZpb);
            }
        }

    //信息-二看
    public  void infoAndDetention2(){

        List<Ryjbxx> listInfoRyjbxxb = infoService.getInfoRyjbxxb("320500112");
        for (int i = 0; i < listInfoRyjbxxb.size(); i++) {
            String infoRybh = listInfoRyjbxxb.get(i).getRybh();
            Ryjbxx infoRyjbxx = listInfoRyjbxxb.get(i);
            //根据rybh查老二看ryjbxxb
            List<SRyjbxxb> listSRyjbxx = detention2Service.getDt2Ryjbxxb(infoRybh);
            SRyjbxxb dt2Ryjbxx = new SRyjbxxb();
            dt2Ryjbxx.setRybh(infoRyjbxx.getRybh());
            dt2Ryjbxx.setJsbh(infoRyjbxx.getJsbh());
            dt2Ryjbxx.setBh(infoRyjbxx.getBh());
            dt2Ryjbxx.setXm(infoRyjbxx.getXm());
            dt2Ryjbxx.setMzxm(infoRyjbxx.getMzxm());
            dt2Ryjbxx.setBm(infoRyjbxx.getBm());
            dt2Ryjbxx.setXb(infoRyjbxx.getXb());
            dt2Ryjbxx.setCsrq(infoRyjbxx.getCsrq());
            dt2Ryjbxx.setZzmm(infoRyjbxx.getZzmm());
            dt2Ryjbxx.setZjlx(infoRyjbxx.getZjlx());
            dt2Ryjbxx.setZjhm(infoRyjbxx.getZjhm());
            dt2Ryjbxx.setHzh(infoRyjbxx.getHzh());
            dt2Ryjbxx.setHyzk(infoRyjbxx.getHyzk());
            dt2Ryjbxx.setMz(infoRyjbxx.getMz());
            dt2Ryjbxx.setGj(infoRyjbxx.getGj());
            dt2Ryjbxx.setJg(infoRyjbxx.getJg());
            dt2Ryjbxx.setZc(infoRyjbxx.getZc());
            dt2Ryjbxx.setWhcd(infoRyjbxx.getWhcd());
            dt2Ryjbxx.setZy(infoRyjbxx.getZy());
            dt2Ryjbxx.setGzdw(infoRyjbxx.getGzdw());
            dt2Ryjbxx.setZw(infoRyjbxx.getZw());
            dt2Ryjbxx.setSf(infoRyjbxx.getSf());
            dt2Ryjbxx.setTssf(infoRyjbxx.getTssf());
            dt2Ryjbxx.setHjszd(infoRyjbxx.getHjszd());
            dt2Ryjbxx.setHjdxz(infoRyjbxx.getHjdxz());
            dt2Ryjbxx.setXzzqh(infoRyjbxx.getXzzqh());
            dt2Ryjbxx.setXzzxz(infoRyjbxx.getXzzxz());
            dt2Ryjbxx.setDah(infoRyjbxx.getDah());
            dt2Ryjbxx.setZwbh(infoRyjbxx.getZwbh());
            dt2Ryjbxx.setBz(infoRyjbxx.getBz());
            dt2Ryjbxx.setJsh(infoRyjbxx.getJsh());
            dt2Ryjbxx.setGyqx(infoRyjbxx.getGyqx());
            dt2Ryjbxx.setRybj(infoRyjbxx.getRybj());
            dt2Ryjbxx.setPyzt(infoRyjbxx.getPyzt());
            dt2Ryjbxx.setCzr(infoRyjbxx.getCzr());
            dt2Ryjbxx.setSdrq(infoRyjbxx.getSdrq());
            dt2Ryjbxx.setFlwsh(infoRyjbxx.getFlwsh());
            dt2Ryjbxx.setHyrq(infoRyjbxx.getHyrq());
            dt2Ryjbxx.setSsjd(infoRyjbxx.getSsjd());
            dt2Ryjbxx.setBadw(infoRyjbxx.getBadw());
            dt2Ryjbxx.setBadwlx(infoRyjbxx.getBadwlx());
            dt2Ryjbxx.setBar(infoRyjbxx.getBar());
            dt2Ryjbxx.setClsj(infoRyjbxx.getClsj());
            dt2Ryjbxx.setCljg(infoRyjbxx.getCljg());
            dt2Ryjbxx.setXq(infoRyjbxx.getXq());
            dt2Ryjbxx.setXqksrq(infoRyjbxx.getXqksrq());
            dt2Ryjbxx.setXqjzrq(infoRyjbxx.getXqjzrq());
            dt2Ryjbxx.setFjcl(infoRyjbxx.getFjcl());
            dt2Ryjbxx.setFjclxq(infoRyjbxx.getFjclxq());
            dt2Ryjbxx.setSsrq(infoRyjbxx.getSsrq());
            dt2Ryjbxx.setZxrq(infoRyjbxx.getZxrq());
            dt2Ryjbxx.setFjje(infoRyjbxx.getFjje());
            dt2Ryjbxx.setHxxq(infoRyjbxx.getHxxq());
            dt2Ryjbxx.setSpz(infoRyjbxx.getSpz());
            dt2Ryjbxx.setBardh(infoRyjbxx.getBardh());
            dt2Ryjbxx.setWxdj(infoRyjbxx.getWxdj());
            dt2Ryjbxx.setFh(infoRyjbxx.getFh());
            dt2Ryjbxx.setCzsjc(infoRyjbxx.getCzsjc());
            dt2Ryjbxx.setJbxxlb(infoRyjbxx.getJbxxlb());
            dt2Ryjbxx.setStxxlb(infoRyjbxx.getStxxlb());
            dt2Ryjbxx.setZhxxlb(infoRyjbxx.getZhxxlb());
            dt2Ryjbxx.setJbxxzfs(infoRyjbxx.getJbxxzfs());
            dt2Ryjbxx.setStxxzfs(infoRyjbxx.getStxxzfs());
            dt2Ryjbxx.setZhxxzfs(infoRyjbxx.getZhxxzfs());
            dt2Ryjbxx.setRsqbx(infoRyjbxx.getRsqbx());
            dt2Ryjbxx.setRsqbxfs(infoRyjbxx.getRsqbxfs());
            dt2Ryjbxx.setYxlshj(infoRyjbxx.getYxlshj());

            if(listSRyjbxx != null && !listSRyjbxx.isEmpty()){
                //修改
                detention2Service.updDt2Ryjbxxb(dt2Ryjbxx);
            }else {
                //新增
                detention2Service.insDt2Ryjbxxb(dt2Ryjbxx);
            }
            //根据rybh查老二看rybdxxb
            List<SRybdxxb> listSRybdxx = detention2Service.getDt2Rybdxxb(infoRybh);
            //先删除再新增
            detention2Service.delDt2Rybdxxb(infoRybh);
            List<Rybdxx> infoRybdxx = infoService.getInfoRybdxxb(infoRybh);
            SRybdxxb dt2Rybdxx = new SRybdxxb();
            dt2Rybdxx.setRybh(infoRybdxx.get(0).getRybh());
            dt2Rybdxx.setDbrq(infoRybdxx.get(0).getDbrq());
            dt2Rybdxx.setJlrq(infoRybdxx.get(0).getJlrq());
            dt2Rybdxx.setRsrq(infoRybdxx.get(0).getRsrq());
            dt2Rybdxx.setRsyy(infoRybdxx.get(0).getRsyy());
            dt2Rybdxx.setSypz(infoRybdxx.get(0).getSypz());
            dt2Rybdxx.setZldw(infoRybdxx.get(0).getZldw());
            dt2Rybdxx.setSydw(infoRybdxx.get(0).getSydw());
            dt2Rybdxx.setSyr(infoRybdxx.get(0).getSyr());
            dt2Rybdxx.setFlwsh(infoRybdxx.get(0).getCsflwsh());
            dt2Rybdxx.setBz(infoRybdxx.get(0).getBz());
            dt2Rybdxx.setWffzjl(infoRybdxx.get(0).getWffzjl());
            dt2Rybdxx.setCylb(infoRybdxx.get(0).getCylb());
            dt2Rybdxx.setAjlb(infoRybdxx.get(0).getAjlb());
            dt2Rybdxx.setJyaq(infoRybdxx.get(0).getJyaq());
            dt2Rybdxx.setZxf(infoRybdxx.get(0).getZxf());
            dt2Rybdxx.setRygllb(infoRybdxx.get(0).getRygllb());
            dt2Rybdxx.setBadw(infoRybdxx.get(0).getBadw());
            dt2Rybdxx.setPzrq(infoRybdxx.get(0).getPzrq());
            dt2Rybdxx.setPzdw(infoRybdxx.get(0).getPzdw());
            dt2Rybdxx.setPzr(infoRybdxx.get(0).getPzr());
            dt2Rybdxx.setCsrq(infoRybdxx.get(0).getCsrq());
            dt2Rybdxx.setCsyy(infoRybdxx.get(0).getCsyy());
            dt2Rybdxx.setCsqx(infoRybdxx.get(0).getCsqx());
            dt2Rybdxx.setJddw(infoRybdxx.get(0).getJddw());
            dt2Rybdxx.setDbr(infoRybdxx.get(0).getDbr());
            dt2Rybdxx.setDbryzyrgx(infoRybdxx.get(0).getDbryzyrgx());
            dt2Rybdxx.setDbrzz(infoRybdxx.get(0).getDbrzz());
            dt2Rybdxx.setDbrgzdw(infoRybdxx.get(0).getDbrgzdw());
            dt2Rybdxx.setSnbx(infoRybdxx.get(0).getSnbx());
            dt2Rybdxx.setHssj(infoRybdxx.get(0).getHssj());
            dt2Rybdxx.setJyrq(infoRybdxx.get(0).getJyrq());
            dt2Rybdxx.setWzbf(infoRybdxx.get(0).getWzbf());
            dt2Rybdxx.setFaccode(infoRybdxx.get(0).getWzbf());
            dt2Rybdxx.setCzsjc(infoRybdxx.get(0).getCzsjc());
            dt2Rybdxx.setJsbh(infoRybdxx.get(0).getZyjsbh());
            dt2Rybdxx.setSybjl(infoRybdxx.get(0).getSybjl());
            detention2Service.insDt2Rybdxxb(dt2Rybdxx);

            //根据rybh查老二看zpb
            List<SZpb> listSZpb = detention2Service.getDt2Zpb(infoRybh);

            if(listSZpb != null && !listSZpb.isEmpty()){
                //删除
                detention2Service.delDt2Zpb(infoRybh);
            }
            //新增
            SZpb sZpb = new SZpb();
            Zpb zpb =infoService.getInfoZpb(infoRybh);
            sZpb.setRybh(zpb.getRybh());
            sZpb.setZybh(zpb.getZybh());
            sZpb.setPic(zpb.getPic());
            sZpb.setCzsjc(zpb.getCzsjc());
            detention2Service.insDt2Zpb(sZpb);
        }
    }

    //信息-三看
    public  void infoAndDetention3(){

        List<Ryjbxx> listInfoRyjbxxb = infoService.getInfoRyjbxxb("320500113");
        for (int i = 0; i < listInfoRyjbxxb.size(); i++) {
            String infoRybh = listInfoRyjbxxb.get(i).getRybh();
            Ryjbxx infoRyjbxx = listInfoRyjbxxb.get(i);
            //根据rybh查老三看ryjbxxb
            List<SRyjbxxb> listSRyjbxx = detention3Service.getDt3Ryjbxxb(infoRybh);
            SRyjbxxb dt3Ryjbxx = new SRyjbxxb();
            dt3Ryjbxx.setRybh(infoRyjbxx.getRybh());
            dt3Ryjbxx.setJsbh(infoRyjbxx.getJsbh());
            dt3Ryjbxx.setBh(infoRyjbxx.getBh());
            dt3Ryjbxx.setXm(infoRyjbxx.getXm());
            dt3Ryjbxx.setMzxm(infoRyjbxx.getMzxm());
            dt3Ryjbxx.setBm(infoRyjbxx.getBm());
            dt3Ryjbxx.setXb(infoRyjbxx.getXb());
            dt3Ryjbxx.setCsrq(infoRyjbxx.getCsrq());
            dt3Ryjbxx.setZzmm(infoRyjbxx.getZzmm());
            dt3Ryjbxx.setZjlx(infoRyjbxx.getZjlx());
            dt3Ryjbxx.setZjhm(infoRyjbxx.getZjhm());
            dt3Ryjbxx.setHzh(infoRyjbxx.getHzh());
            dt3Ryjbxx.setHyzk(infoRyjbxx.getHyzk());
            dt3Ryjbxx.setMz(infoRyjbxx.getMz());
            dt3Ryjbxx.setGj(infoRyjbxx.getGj());
            dt3Ryjbxx.setJg(infoRyjbxx.getJg());
            dt3Ryjbxx.setZc(infoRyjbxx.getZc());
            dt3Ryjbxx.setWhcd(infoRyjbxx.getWhcd());
            dt3Ryjbxx.setZy(infoRyjbxx.getZy());
            dt3Ryjbxx.setGzdw(infoRyjbxx.getGzdw());
            dt3Ryjbxx.setZw(infoRyjbxx.getZw());
            dt3Ryjbxx.setSf(infoRyjbxx.getSf());
            dt3Ryjbxx.setTssf(infoRyjbxx.getTssf());
            dt3Ryjbxx.setHjszd(infoRyjbxx.getHjszd());
            dt3Ryjbxx.setHjdxz(infoRyjbxx.getHjdxz());
            dt3Ryjbxx.setXzzqh(infoRyjbxx.getXzzqh());
            dt3Ryjbxx.setXzzxz(infoRyjbxx.getXzzxz());
            dt3Ryjbxx.setDah(infoRyjbxx.getDah());
            dt3Ryjbxx.setZwbh(infoRyjbxx.getZwbh());
            dt3Ryjbxx.setBz(infoRyjbxx.getBz());
            dt3Ryjbxx.setJsh(infoRyjbxx.getJsh());
            dt3Ryjbxx.setGyqx(infoRyjbxx.getGyqx());
            dt3Ryjbxx.setRybj(infoRyjbxx.getRybj());
            dt3Ryjbxx.setPyzt(infoRyjbxx.getPyzt());
            dt3Ryjbxx.setCzr(infoRyjbxx.getCzr());
            dt3Ryjbxx.setSdrq(infoRyjbxx.getSdrq());
            dt3Ryjbxx.setFlwsh(infoRyjbxx.getFlwsh());
            dt3Ryjbxx.setHyrq(infoRyjbxx.getHyrq());
            dt3Ryjbxx.setSsjd(infoRyjbxx.getSsjd());
            dt3Ryjbxx.setBadw(infoRyjbxx.getBadw());
            dt3Ryjbxx.setBadwlx(infoRyjbxx.getBadwlx());
            dt3Ryjbxx.setBar(infoRyjbxx.getBar());
            dt3Ryjbxx.setClsj(infoRyjbxx.getClsj());
            dt3Ryjbxx.setCljg(infoRyjbxx.getCljg());
            dt3Ryjbxx.setXq(infoRyjbxx.getXq());
            dt3Ryjbxx.setXqksrq(infoRyjbxx.getXqksrq());
            dt3Ryjbxx.setXqjzrq(infoRyjbxx.getXqjzrq());
            dt3Ryjbxx.setFjcl(infoRyjbxx.getFjcl());
            dt3Ryjbxx.setFjclxq(infoRyjbxx.getFjclxq());
            dt3Ryjbxx.setSsrq(infoRyjbxx.getSsrq());
            dt3Ryjbxx.setZxrq(infoRyjbxx.getZxrq());
            dt3Ryjbxx.setFjje(infoRyjbxx.getFjje());
            dt3Ryjbxx.setHxxq(infoRyjbxx.getHxxq());
            dt3Ryjbxx.setSpz(infoRyjbxx.getSpz());
            dt3Ryjbxx.setBardh(infoRyjbxx.getBardh());
            dt3Ryjbxx.setWxdj(infoRyjbxx.getWxdj());
            dt3Ryjbxx.setFh(infoRyjbxx.getFh());
            dt3Ryjbxx.setCzsjc(infoRyjbxx.getCzsjc());
            dt3Ryjbxx.setJbxxlb(infoRyjbxx.getJbxxlb());
            dt3Ryjbxx.setStxxlb(infoRyjbxx.getStxxlb());
            dt3Ryjbxx.setZhxxlb(infoRyjbxx.getZhxxlb());
            dt3Ryjbxx.setJbxxzfs(infoRyjbxx.getJbxxzfs());
            dt3Ryjbxx.setStxxzfs(infoRyjbxx.getStxxzfs());
            dt3Ryjbxx.setZhxxzfs(infoRyjbxx.getZhxxzfs());
            dt3Ryjbxx.setRsqbx(infoRyjbxx.getRsqbx());
            dt3Ryjbxx.setRsqbxfs(infoRyjbxx.getRsqbxfs());
            dt3Ryjbxx.setYxlshj(infoRyjbxx.getYxlshj());

            if(listSRyjbxx != null && !listSRyjbxx.isEmpty()){
                //修改
                detention3Service.updDt3Ryjbxxb(dt3Ryjbxx);
            }else {
                //新增
                detention3Service.insDt3Ryjbxxb(dt3Ryjbxx);
            }
            //根据rybh查老三看rybdxxb
            List<SRybdxxb> listSRybdxx = detention3Service.getDt3Rybdxxb(infoRybh);
            //先删除再新增

            detention3Service.delDt3Rybdxxb(infoRybh);
            List<Rybdxx> infoRybdxx = infoService.getInfoRybdxxb(infoRybh);
            SRybdxxb dt3Rybdxx = new SRybdxxb();
            dt3Rybdxx.setRybh(infoRybdxx.get(0).getRybh());
            dt3Rybdxx.setDbrq(infoRybdxx.get(0).getDbrq());
            dt3Rybdxx.setJlrq(infoRybdxx.get(0).getJlrq());
            dt3Rybdxx.setRsrq(infoRybdxx.get(0).getRsrq());
            dt3Rybdxx.setRsyy(infoRybdxx.get(0).getRsyy());
            dt3Rybdxx.setSypz(infoRybdxx.get(0).getSypz());
            dt3Rybdxx.setZldw(infoRybdxx.get(0).getZldw());
            dt3Rybdxx.setSydw(infoRybdxx.get(0).getSydw());
            dt3Rybdxx.setSyr(infoRybdxx.get(0).getSyr());
            dt3Rybdxx.setFlwsh(infoRybdxx.get(0).getCsflwsh());
            dt3Rybdxx.setBz(infoRybdxx.get(0).getBz());
            dt3Rybdxx.setWffzjl(infoRybdxx.get(0).getWffzjl());
            dt3Rybdxx.setCylb(infoRybdxx.get(0).getCylb());
            dt3Rybdxx.setAjlb(infoRybdxx.get(0).getAjlb());
            dt3Rybdxx.setJyaq(infoRybdxx.get(0).getJyaq());
            dt3Rybdxx.setZxf(infoRybdxx.get(0).getZxf());
            dt3Rybdxx.setRygllb(infoRybdxx.get(0).getRygllb());
            dt3Rybdxx.setBadw(infoRybdxx.get(0).getBadw());
            dt3Rybdxx.setPzrq(infoRybdxx.get(0).getPzrq());
            dt3Rybdxx.setPzdw(infoRybdxx.get(0).getPzdw());
            dt3Rybdxx.setPzr(infoRybdxx.get(0).getPzr());
            dt3Rybdxx.setCsrq(infoRybdxx.get(0).getCsrq());
            dt3Rybdxx.setCsyy(infoRybdxx.get(0).getCsyy());
            dt3Rybdxx.setCsqx(infoRybdxx.get(0).getCsqx());
            dt3Rybdxx.setJddw(infoRybdxx.get(0).getJddw());
            dt3Rybdxx.setDbr(infoRybdxx.get(0).getDbr());
            dt3Rybdxx.setDbryzyrgx(infoRybdxx.get(0).getDbryzyrgx());
            dt3Rybdxx.setDbrzz(infoRybdxx.get(0).getDbrzz());
            dt3Rybdxx.setDbrgzdw(infoRybdxx.get(0).getDbrgzdw());
            dt3Rybdxx.setSnbx(infoRybdxx.get(0).getSnbx());
            dt3Rybdxx.setHssj(infoRybdxx.get(0).getHssj());
            dt3Rybdxx.setJyrq(infoRybdxx.get(0).getJyrq());
            dt3Rybdxx.setWzbf(infoRybdxx.get(0).getWzbf());
            dt3Rybdxx.setFaccode(infoRybdxx.get(0).getWzbf());
            dt3Rybdxx.setCzsjc(infoRybdxx.get(0).getCzsjc());
            dt3Rybdxx.setJsbh(infoRybdxx.get(0).getZyjsbh());
            dt3Rybdxx.setSybjl(infoRybdxx.get(0).getSybjl());
            detention3Service.insDt3Rybdxxb(dt3Rybdxx);
            //根据rybh查老三看zpb
            List<SZpb> listSZpb = detention3Service.getDt3Zpb(infoRybh);

            if(listSZpb != null && !listSZpb.isEmpty()){
                //删除
                detention3Service.delDt3Zpb(infoRybh);
            }
            //新增
            SZpb sZpb = new SZpb();
            Zpb zpb =infoService.getInfoZpb(infoRybh);
            sZpb.setRybh(zpb.getRybh());
            sZpb.setZybh(zpb.getZybh());
            sZpb.setPic(zpb.getPic());
            sZpb.setCzsjc(zpb.getCzsjc());
            detention3Service.insDt3Zpb(sZpb);
        }
    }

    //信息-四看
    public  void infoAndDetention4(){

        List<Ryjbxx> listInfoRyjbxxb = infoService.getInfoRyjbxxb("320500114");
        for (int i = 0; i < listInfoRyjbxxb.size(); i++) {
            String infoRybh = listInfoRyjbxxb.get(i).getRybh();
            Ryjbxx infoRyjbxx = listInfoRyjbxxb.get(i);
            //根据rybh查老四看ryjbxxb
            List<SRyjbxxb> listSRyjbxx = detention4Service.getDt4Ryjbxxb(infoRybh);
            SRyjbxxb dt4Ryjbxx = new SRyjbxxb();
            dt4Ryjbxx.setRybh(infoRyjbxx.getRybh());
            dt4Ryjbxx.setJsbh(infoRyjbxx.getJsbh());
            dt4Ryjbxx.setBh(infoRyjbxx.getBh());
            dt4Ryjbxx.setXm(infoRyjbxx.getXm());
            dt4Ryjbxx.setMzxm(infoRyjbxx.getMzxm());
            dt4Ryjbxx.setBm(infoRyjbxx.getBm());
            dt4Ryjbxx.setXb(infoRyjbxx.getXb());
            dt4Ryjbxx.setCsrq(infoRyjbxx.getCsrq());
            dt4Ryjbxx.setZzmm(infoRyjbxx.getZzmm());
            dt4Ryjbxx.setZjlx(infoRyjbxx.getZjlx());
            dt4Ryjbxx.setZjhm(infoRyjbxx.getZjhm());
            dt4Ryjbxx.setHzh(infoRyjbxx.getHzh());
            dt4Ryjbxx.setHyzk(infoRyjbxx.getHyzk());
            dt4Ryjbxx.setMz(infoRyjbxx.getMz());
            dt4Ryjbxx.setGj(infoRyjbxx.getGj());
            dt4Ryjbxx.setJg(infoRyjbxx.getJg());
            dt4Ryjbxx.setZc(infoRyjbxx.getZc());
            dt4Ryjbxx.setWhcd(infoRyjbxx.getWhcd());
            dt4Ryjbxx.setZy(infoRyjbxx.getZy());
            dt4Ryjbxx.setGzdw(infoRyjbxx.getGzdw());
            dt4Ryjbxx.setZw(infoRyjbxx.getZw());
            dt4Ryjbxx.setSf(infoRyjbxx.getSf());
            dt4Ryjbxx.setTssf(infoRyjbxx.getTssf());
            dt4Ryjbxx.setHjszd(infoRyjbxx.getHjszd());
            dt4Ryjbxx.setHjdxz(infoRyjbxx.getHjdxz());
            dt4Ryjbxx.setXzzqh(infoRyjbxx.getXzzqh());
            dt4Ryjbxx.setXzzxz(infoRyjbxx.getXzzxz());
            dt4Ryjbxx.setDah(infoRyjbxx.getDah());
            dt4Ryjbxx.setZwbh(infoRyjbxx.getZwbh());
            dt4Ryjbxx.setBz(infoRyjbxx.getBz());
            dt4Ryjbxx.setJsh(infoRyjbxx.getJsh());
            dt4Ryjbxx.setGyqx(infoRyjbxx.getGyqx());
            dt4Ryjbxx.setRybj(infoRyjbxx.getRybj());
            dt4Ryjbxx.setPyzt(infoRyjbxx.getPyzt());
            dt4Ryjbxx.setCzr(infoRyjbxx.getCzr());
            dt4Ryjbxx.setSdrq(infoRyjbxx.getSdrq());
            dt4Ryjbxx.setFlwsh(infoRyjbxx.getFlwsh());
            dt4Ryjbxx.setHyrq(infoRyjbxx.getHyrq());
            dt4Ryjbxx.setSsjd(infoRyjbxx.getSsjd());
            dt4Ryjbxx.setBadw(infoRyjbxx.getBadw());
            dt4Ryjbxx.setBadwlx(infoRyjbxx.getBadwlx());
            dt4Ryjbxx.setBar(infoRyjbxx.getBar());
            dt4Ryjbxx.setClsj(infoRyjbxx.getClsj());
            dt4Ryjbxx.setCljg(infoRyjbxx.getCljg());
            dt4Ryjbxx.setXq(infoRyjbxx.getXq());
            dt4Ryjbxx.setXqksrq(infoRyjbxx.getXqksrq());
            dt4Ryjbxx.setXqjzrq(infoRyjbxx.getXqjzrq());
            dt4Ryjbxx.setFjcl(infoRyjbxx.getFjcl());
            dt4Ryjbxx.setFjclxq(infoRyjbxx.getFjclxq());
            dt4Ryjbxx.setSsrq(infoRyjbxx.getSsrq());
            dt4Ryjbxx.setZxrq(infoRyjbxx.getZxrq());
            dt4Ryjbxx.setFjje(infoRyjbxx.getFjje());
            dt4Ryjbxx.setHxxq(infoRyjbxx.getHxxq());
            dt4Ryjbxx.setSpz(infoRyjbxx.getSpz());
            dt4Ryjbxx.setBardh(infoRyjbxx.getBardh());
            dt4Ryjbxx.setWxdj(infoRyjbxx.getWxdj());
            dt4Ryjbxx.setFh(infoRyjbxx.getFh());
            dt4Ryjbxx.setCzsjc(infoRyjbxx.getCzsjc());
            dt4Ryjbxx.setJbxxlb(infoRyjbxx.getJbxxlb());
            dt4Ryjbxx.setStxxlb(infoRyjbxx.getStxxlb());
            dt4Ryjbxx.setZhxxlb(infoRyjbxx.getZhxxlb());
            dt4Ryjbxx.setJbxxzfs(infoRyjbxx.getJbxxzfs());
            dt4Ryjbxx.setStxxzfs(infoRyjbxx.getStxxzfs());
            dt4Ryjbxx.setZhxxzfs(infoRyjbxx.getZhxxzfs());
            dt4Ryjbxx.setRsqbx(infoRyjbxx.getRsqbx());
            dt4Ryjbxx.setRsqbxfs(infoRyjbxx.getRsqbxfs());
            dt4Ryjbxx.setYxlshj(infoRyjbxx.getYxlshj());

            if(listSRyjbxx != null && !listSRyjbxx.isEmpty()){
                //修改
                detention4Service.updDt4Ryjbxxb(dt4Ryjbxx);
            }else {
                //新增
                detention4Service.insDt4Ryjbxxb(dt4Ryjbxx);
            }
            //根据rybh查老四看rybdxxb
            List<SRybdxxb> listSRybdxx = detention4Service.getDt4Rybdxxb(infoRybh);
            //先删除再新增

            detention4Service.delDt4Rybdxxb(infoRybh);
            List<Rybdxx> infoRybdxx = infoService.getInfoRybdxxb(infoRybh);
            SRybdxxb dt4Rybdxx = new SRybdxxb();
            dt4Rybdxx.setRybh(infoRybdxx.get(0).getRybh());
            dt4Rybdxx.setDbrq(infoRybdxx.get(0).getDbrq());
            dt4Rybdxx.setJlrq(infoRybdxx.get(0).getJlrq());
            dt4Rybdxx.setRsrq(infoRybdxx.get(0).getRsrq());
            dt4Rybdxx.setRsyy(infoRybdxx.get(0).getRsyy());
            dt4Rybdxx.setSypz(infoRybdxx.get(0).getSypz());
            dt4Rybdxx.setZldw(infoRybdxx.get(0).getZldw());
            dt4Rybdxx.setSydw(infoRybdxx.get(0).getSydw());
            dt4Rybdxx.setSyr(infoRybdxx.get(0).getSyr());
            dt4Rybdxx.setFlwsh(infoRybdxx.get(0).getCsflwsh());
            dt4Rybdxx.setBz(infoRybdxx.get(0).getBz());
            dt4Rybdxx.setWffzjl(infoRybdxx.get(0).getWffzjl());
            dt4Rybdxx.setCylb(infoRybdxx.get(0).getCylb());
            dt4Rybdxx.setAjlb(infoRybdxx.get(0).getAjlb());
            dt4Rybdxx.setJyaq(infoRybdxx.get(0).getJyaq());
            dt4Rybdxx.setZxf(infoRybdxx.get(0).getZxf());
            dt4Rybdxx.setRygllb(infoRybdxx.get(0).getRygllb());
            dt4Rybdxx.setBadw(infoRybdxx.get(0).getBadw());
            dt4Rybdxx.setPzrq(infoRybdxx.get(0).getPzrq());
            dt4Rybdxx.setPzdw(infoRybdxx.get(0).getPzdw());
            dt4Rybdxx.setPzr(infoRybdxx.get(0).getPzr());
            dt4Rybdxx.setCsrq(infoRybdxx.get(0).getCsrq());
            dt4Rybdxx.setCsyy(infoRybdxx.get(0).getCsyy());
            dt4Rybdxx.setCsqx(infoRybdxx.get(0).getCsqx());
            dt4Rybdxx.setJddw(infoRybdxx.get(0).getJddw());
            dt4Rybdxx.setDbr(infoRybdxx.get(0).getDbr());
            dt4Rybdxx.setDbryzyrgx(infoRybdxx.get(0).getDbryzyrgx());
            dt4Rybdxx.setDbrzz(infoRybdxx.get(0).getDbrzz());
            dt4Rybdxx.setDbrgzdw(infoRybdxx.get(0).getDbrgzdw());
            dt4Rybdxx.setSnbx(infoRybdxx.get(0).getSnbx());
            dt4Rybdxx.setHssj(infoRybdxx.get(0).getHssj());
            dt4Rybdxx.setJyrq(infoRybdxx.get(0).getJyrq());
            dt4Rybdxx.setWzbf(infoRybdxx.get(0).getWzbf());
            dt4Rybdxx.setFaccode(infoRybdxx.get(0).getWzbf());
            dt4Rybdxx.setCzsjc(infoRybdxx.get(0).getCzsjc());
            dt4Rybdxx.setJsbh(infoRybdxx.get(0).getZyjsbh());
            dt4Rybdxx.setSybjl(infoRybdxx.get(0).getSybjl());
            detention4Service.insDt4Rybdxxb(dt4Rybdxx);
            //根据rybh查老四看zpb
            List<SZpb> listSZpb = detention4Service.getDt4Zpb(infoRybh);

            if(listSZpb != null && !listSZpb.isEmpty()){
                //删除
                detention4Service.delDt4Zpb(infoRybh);
            }
            //新增
            SZpb sZpb = new SZpb();
            Zpb zpb =infoService.getInfoZpb(infoRybh);
            sZpb.setRybh(zpb.getRybh());
            sZpb.setZybh(zpb.getZybh());
            sZpb.setPic(zpb.getPic());
            sZpb.setCzsjc(zpb.getCzsjc());
            detention4Service.insDt4Zpb(sZpb);
        }
    }

    //律师会见 信息-实战
    public  void  infoAndActualLshj(String key){
        for (int i = 1; i <= 4 ; i++) {
            List<Lshjxx> listInfoLshj = infoService.getInfoLshjxxb("32050011"+i,key);
            for (int j = 0; j < listInfoLshj.size(); j++) {
                String infoRybh = listInfoLshj.get(j).getRybh();
                Lshjxx infoLshjxx = listInfoLshj.get(j);
                LshjxxbKss actualLshjxx1 = new LshjxxbKss();
                actualLshjxx1.setRybh(infoRybh);
                actualLshjxx1.setHjkssj(infoLshjxx.getHjkssj());
                actualLshjxx1.setHjjssj(infoLshjxx.getHjjssj());
                actualLshjxx1.setLsdw(infoLshjxx.getLsdw());
                actualLshjxx1.setWtr(infoLshjxx.getWtr());
                List<LshjxxbKss> listActualLshjxx = actualService.getActualLshj(actualLshjxx1);
                if(listActualLshjxx == null && listActualLshjxx.isEmpty()){
                    LshjxxbKss actualLshjxx2 = new LshjxxbKss();
                    actualLshjxx2.setZybh(infoLshjxx.getZybh());
                    actualLshjxx2.setRybh(infoRybh);
                    actualLshjxx2.setLsxm(infoLshjxx.getLsxm());
                    actualLshjxx2.setLszjh(infoLshjxx.getLszjh());
                    actualLshjxx2.setRs(infoLshjxx.getRs());
                    actualLshjxx2.setPzr(infoLshjxx.getPzr());
                    actualLshjxx2.setGznr(infoLshjxx.getGznr());
                    actualLshjxx2.setHjs(infoLshjxx.getHjs());
                    actualLshjxx2.setTcry(infoLshjxx.getTcry());
                    actualLshjxx2.setThry(infoLshjxx.getThry()) ;
                    actualLshjxx2.setJdmj(infoLshjxx.getJdmj());
                    actualLshjxx2.setHjkssj(infoLshjxx.getHjkssj());
                    actualLshjxx2.setHjjssj(infoLshjxx.getHjjssj());
                    actualLshjxx2.setLsdw(infoLshjxx.getLsdw());
                    actualLshjxx2.setWtr(infoLshjxx.getWtr());
                    actualLshjxx2.setFaccode(infoLshjxx.getFaccode());
                    actualLshjxx2.setWjqrcssj(infoLshjxx.getWjqrcssj());
                    actualLshjxx2.setWjqrhssj(infoLshjxx.getWjqrhssj());
                    actualLshjxx2.setDcry(infoLshjxx.getDcry());
                    actualLshjxx2.setDhry(infoLshjxx.getDhry());
                    actualLshjxx2.setCzsjc(infoLshjxx.getCzsjc());
                    actualLshjxx2.setJsbh(infoLshjxx.getZyjsbh());
                    actualLshjxx2.setSybjl(infoLshjxx.getSybjl());
                    actualService.insActualLshj(actualLshjxx2);
                }
            }
        }
    }

    //律师会见 常熟-实战
    public  void csAndActualLshj1(){
        List<SLshjxxb> listCSLshj = detentionCSService.getCSLshjxxb();
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
            if(listActualLshjxx == null && listActualLshjxx.isEmpty()){
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
                actualLshjxx2.setThry(sLshjxx.getThry()) ;
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
    public  void tcAndActualLshj2(){
        List<SLshjxxb> listTCLshj = detentionTCService.getTCLshjxxb();
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
            if(listActualLshjxx == null && listActualLshjxx.isEmpty()){
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
                actualLshjxx2.setThry(sLshjxx.getThry()) ;
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
    public  void wjAndActualLshj3(){
        List<SLshjxxb> listWJLshj = detentionWJService.getWJLshjxxb();
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
            if(listActualLshjxx == null && listActualLshjxx.isEmpty()){
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
                actualLshjxx2.setThry(sLshjxx.getThry()) ;
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
    public  void zjgAndActualLshj4(){
        List<SLshjxxb> listZJGLshj = detentionZJGService.getZJGLshjxxb();
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
            if(listActualLshjxx == null && listActualLshjxx.isEmpty()){
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
                actualLshjxx2.setThry(sLshjxx.getThry()) ;
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
    public  void ksAndActualLshj5(){
        List<SLshjxxb> listKSLshj = detentionKSService.getKSLshjxxb();
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
            if(listActualLshjxx == null && listActualLshjxx.isEmpty()){
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
                actualLshjxx2.setThry(sLshjxx.getThry()) ;
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

    //入所日期 信息 - 实战
    public  void infoAndActualRsrq(){
        for (int i = 1; i <= 4 ; i++) {
            List<Rybdxx> listRybdxx = infoService.getInfoRsrq("32050011"+i);
            for (int j = 0; j < listRybdxx.size(); j++) {
                String infoRybh = listRybdxx.get(j).getRybh();
                actualService.upaActualRybdxxRsrq(infoRybh,listRybdxx.get(j).getRsrq());
            }
        }
    }
}
