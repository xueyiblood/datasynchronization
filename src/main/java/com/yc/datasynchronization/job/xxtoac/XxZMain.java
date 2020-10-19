package com.yc.datasynchronization.job.xxtoac;

import com.yc.datasynchronization.util.ConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XxZMain {

    @Autowired
    private XxLshj xxLshj;
    @Autowired
    private XxTx xxtx;
    @Autowired
    private XxTy xxty;


    public void doMain() {

        String hj = ConfigUtil.getConfig("HJ");
        String yl = ConfigUtil.getConfig("YL");
        String ty = ConfigUtil.getConfig("TY");
        String tx = ConfigUtil.getConfig("TX");

//        System.out.println("----------提押开始----------");
//        xxty.infoAndActualTy(ty);
//        System.out.println("----------提押结束----------");
//        System.out.println("\t");
//        System.out.println("\t");

        System.out.println("--------律师会见开始---------");
        xxLshj.infoAndActualLshj(hj);
        System.out.println("--------律师会见结束---------");
//        System.out.println("\t");
//        System.out.println("\t");
//        System.out.println("----------提审开始----------");
//        xxtx.infoAndActualTx(tx);
//        System.out.println("----------提审结束----------");
//        System.out.println("\t");
//        System.out.println("\t");

    }

}
