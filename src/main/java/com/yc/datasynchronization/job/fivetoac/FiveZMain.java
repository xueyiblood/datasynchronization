package com.yc.datasynchronization.job.fivetoac;

import com.yc.datasynchronization.util.ConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FiveZMain {


    @Autowired
    private FiveLshj lshj;

    public void doMain() {

        String hj = ConfigUtil.getConfig("HJ");
        String yl = ConfigUtil.getConfig("YL");
        String ty = ConfigUtil.getConfig("TY");
        String tx = ConfigUtil.getConfig("TX");

        System.out.println("--------常熟律师会见开始---------");
        lshj.csAndActualLshj1(hj);
        System.out.println("--------常熟律师会见结束---------");
        System.out.println("\t");
        System.out.println("\t");

        System.out.println("--------太仓律师会见开始---------");
        lshj.tcAndActualLshj2(hj);
        System.out.println("--------太仓律师会见结束---------");
        System.out.println("\t");
        System.out.println("\t");

        System.out.println("--------吴江律师会见开始---------");
        lshj.wjAndActualLshj3(hj);
        System.out.println("--------吴江律师会见结束---------");
        System.out.println("\t");
        System.out.println("\t");

        System.out.println("--------张家港律师会见开始---------");
        lshj.zjgAndActualLshj4(hj);
        System.out.println("--------张家港律师会见结束---------");
        System.out.println("\t");
        System.out.println("\t");

        System.out.println("--------昆山律师会见开始---------");
        lshj.ksAndActualLshj5(hj);
        System.out.println("--------昆山律师会见结束---------");
        System.out.println("\t");
        System.out.println("\t");


    }
}
