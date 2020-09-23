package com.yc.datasynchronization.actual.mapper;

import com.yc.datasynchronization.actual.entity.*;
import com.yc.datasynchronization.infosystem.entity.Txxxb;
import com.yc.datasynchronization.infosystem.entity.Zpb;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface ActualMapper {


    @Select("select * from ryjbxxb_kss where rybh = #{rybh, jdbcType=VARCHAR}")
    List<RyjbxxbKss> getActualRyjbxxb(@Param("rybh") String rybh);

    @Select("select * from rybdxxb_kss where rybh = #{rybh, jdbcType=VARCHAR}")
    List<RybdxxbKss> getActualRybdxxb(@Param("rybh") String rybh);

    @Select("select * from zpb_kss where rybh = #{rybh, jdbcType=VARCHAR}")
    List<Zpb> getActualZpb(@Param("rybh") String rybh);

    @Update("update zpb_kss set pic = #{pic},czsjc = #{czsjc},jsbh = #{jsbh} where rybh = #{rybh}")
    int updActualZpb (Zpb zpb);

    @Delete("delete zpb_kss where rybh = #{rybh}")
    int delActualZpb(@Param("rybh") String rybh);

    @Insert("insert into zpb_kss (zybh,rybh,pic,czsjc,jsbh,sybjl) values(#{zybh},#{rybh},#{pic},#{czsjc},#{jsbh},#{sybjl})")
    int insActualZpb (ZpbKss zpb);

    @Update("update ryjbxxb_kss set jsbh= #{jsbh}," +
            "bh= #{bh},xm= #{xm},xb= #{xb},csrq= #{csrq}," +
            "zzmm= #{zzmm},zjlx= #{zjlx},zjhm= #{zjhm},hyzk= #{hyzk}," +
            "mz= #{mz},gj= #{gj},jg= #{jg},zc= #{zc},whcd= #{whcd}," +
            "zy= #{zy},gzdw= #{gzdw},zw= #{zw},sf= #{sf},tssf= #{tssf}," +
            "hjszd= #{hjszd},hjdxz= #{hjdxz},xzzqh= #{xzzqh},xzzxz= #{xzzxz},bz= #{bz}," +
            "jsh= #{jsh},gyqx= #{gyqx},rybj= #{rybj},pyzt= #{pyzt}," +
            "czr= #{czr},sdrq= #{sdrq},flwsh= #{flwsh},hyrq= #{hyrq},ssjd= #{ssjd}," +
            "badwlx= #{badwlx},badw= #{badw},bar= #{bar}, clsj= #{clsj},cljg= #{cljg},xq= #{xq}," +
            "xqksrq= #{xqksrq},xqjzrq= #{xqjzrq},fjcl= #{fjcl}," +
            "fjclxq= #{fjclxq},ssrq= #{ssrq},zxrq= #{zxrq},fjje= #{fjje},hxxq= #{hxxq},spz= #{spz}," +
            "bardh= #{bardh},wxdj= #{wxdj},fh= #{fh},czsjc= #{czsjc},jbxxlb= #{jbxxlb}," +
            "stxxlb= #{stxxlb},zhxxlb= #{zhxxlb},jbxxzfs= #{jbxxzfs},stxxzfs= #{stxxzfs},zhxxzfs= #{zhxxzfs},rsqbxfs= #{rsqbxfs}," +
            "sybjl= #{sybjl},rsqbx= #{rsqbx} where rybh = #{rybh}")
    int updActualRyjbxxb(RyjbxxbKss ryjbxx);

    @Insert("insert into RYJBXXB_KSS (RYBH,JSBH,BH,XM,XB,CSRQ,ZZMM,ZJLX,ZJHM,HZH,HYZK,MZ,GJ," +
            "JG,ZC,WHCD,ZY,GZDW,ZW,SF,TSSF,HJSZD,HJDXZ,XZZQH,XZZXZ,Dah,Zwbh,BZ," +
            "JSH,GYQX,RYBJ,PYZT,CZR,SDRQ,FLWSH,HYRQ,SSJD,BADWLX,BADW,BAR," +
            "Clsj,Cljg,Xq,Xqksrq,Xqjzrq,Fjcl,Fjclxq,Ssrq,Zxrq,Fjje,Hxxq,Spz,BARDH,WXDJ,Fh,CZSJC,JBXXLB," +
            "Stxxlb,Zhxxlb,Jbxxzfs,Stxxzfs,Zhxxzfs,Rsqbxfs,Sybjl,RSQBX)" +
            "values(#{rybh},#{jsbh},#{bh},#{xm},#{xb},#{csrq},#{zzmm},#{zjlx},#{zjhm},#{hzh},#{hyzk},#{mz},#{gj}," +
            "#{jg},#{zc},#{whcd},#{zy},#{gzdw},#{zw},#{sf},#{tssf},#{hjszd},#{hjdxz},#{xzzqh},#{xzzxz},#{dah},#{zwbh},#{bz}," +
            "#{jsh},#{gyqx},#{rybj},#{pyzt},#{czr},#{sdrq},#{flwsh},#{hyrq},#{ssjd},#{badwlx},#{badw},#{bar}," +
            "#{clsj},#{cljg},#{xq},#{xqksrq},#{xqjzrq},#{fjcl},#{fjclxq},#{ssrq},#{zxrq},#{fjje},#{hxxq},#{spz},#{bardh},#{wxdj},#{fh}," +
            "#{czsjc},#{jbxxlb},#{stxxlb},#{zhxxlb},#{jbxxzfs},#{stxxzfs},#{zhxxzfs},#{rsqbxfs},#{sybjl},#{rsqbx})")
    int insActualRyjbxxb(RyjbxxbKss ryjbxx);

    @Delete("delete rybdxxb_kss where rybh = #{rybh}")
    int delActualRybdxxb(@Param("rybh") String rybh);

    @Insert("insert into RYBDXXB_KSS (ZYBH,RYBH,DBRQ,JLRQ,RSRQ,RSYY,SYPZ,ZLDW,SYDW,SYR,FLWSH,BZ,WFFZJL,CYLB,AJLB,Jyaq," +
            "ZXF,RYGLLB,BADW,PZRQ,PZDW,PZR,Csrq,CSYY,CSQX,JDDW,DBR,DBRYZYRGX,DBRZZ,DBRGZDW," +
            "SNBX,HSSJ,JYRQ,WZBF,FACCODE,CZSJC,jsbh) " +
            "values(#{zybh},#{rybh},#{dbrq},#{jlrq},#{rsrq},#{rsyy},#{sypz},#{zldw},#{sydw},#{syr}," +
            "#{flwsh},#{bz},#{wffzjl},#{cylb},#{ajlb},#{jyaq}," +
            "#{zxf},#{rygllb},#{badw},#{pzrq},#{pzdw},#{pzr},#{csrq},#{csyy},#{csqx},#{jddw},#{dbr},#{dbryzyrgx},#{dbrzz},#{dbrgzdw}," +
            "#{snbx},#{hssj},#{jyrq},#{wzbf},#{faccode},#{czsjc},#{jsbh})")
    int insActualRybdxxb(RybdxxbKss rybdxx);

    @Select("select * from Lshjxxb_kss where rybh = #{rybh} and lsxm = #{lsxm} and hjkssj = #{hjkssj} " +
            "and hjjssj = #{hjjssj} and lsdw = #{lsdw} and tcry = #{tcry} and thry = #{thry} and czsjc = #{czsjc}")
    List<LshjxxbKss> getActualLshj(LshjxxbKss lshjxxbKss);

    @Insert("INSERT INTO LSHJXXB_KSS (ZYBH, RYBH,LSXM,LSZJH,RS,LSDW," +
            "PZR,HJKSSJ,GZNR,HJJSSJ,HJS,TCRY,THRY,JDMJ,WTR,sybjl,FACCODE,WJQRHSSJ,DHRY,WJQRCSSJ,DCRY,czsjc,JSBH)" +
            "values (#{zybh}, #{rybh}, #{lsxm}, #{lszjh}, #{rs}, #{lsdw}, #{pzr}, #{hjkssj,jdbcType=TIMESTAMP}, " +
            "#{gznr}, #{hjjssj,jdbcType=TIMESTAMP}, #{hjs}, #{tcry}, #{thry}, #{jdmj}, #{wtr}" +
            ", #{sybjl,jdbcType=TIMESTAMP}, #{faccode}, #{wjqrhssj,jdbcType=TIMESTAMP}, #{dhry}, " +
            "#{wjqrcssj,jdbcType=TIMESTAMP}, #{dcry}, #{czsjc}, #{jsbh})")
    int insActualLshj(LshjxxbKss lshjxxbKss);

    @Update("update rybdxxb_kss set rsrq = #{rsrq} where rybh = #{rybh}")
    int upaActualRybdxxRsrq(@Param("rybh") String rybh,@Param("rsrq") Date rsrq);


    @Select("select * from RY_YLJLB_KSS where bz = #{bz} and zs = #{zs} and zd = #{zd} and yz = #{yz} and rybh = #{rybh} and zlsj = #{zlsj} " +
            "and zlys = #{zlys} and tz = #{tz} and jsbh = #{jsbh} and yltype ='所内就医'")
    List<YljlbKss> getActualSnyl(YljlbKss yljlbKss);

    @Insert("INSERT INTO RY_YLJLB_KSS (ZYBH, RYBH,ZLSJ,ZLYS,TZ,XY," +
            "XL,TW,ZS,ZD,YZ,FYKSRQ,RYJSRQ,YM,YRJC,FYSL,FACCODE,CZFZ,YLTYPE,BZ,SYBJL,czsjc,JSBH)" +
            "values (#{zybh}, #{rybh}, #{zlsj,jdbcType=TIMESTAMP}, #{zlys}, #{tz}, #{xy}, #{xl}, " +
            "#{tw}, #{zs}, #{zd}, #{yz}, #{fyksrq,jdbcType=TIMESTAMP},#{ryjsrq,jdbcType=TIMESTAMP}, #{ym}, #{yrjc}" +
            ",#{fysl}, #{faccode}, #{czfz}, #{yltype}, #{bz}, #{sybjl,jdbcType=TIMESTAMP}, #{czsjc}, #{jsbh})")
    int insActualSnyl(YljlbKss yljlbKss);

    @Select("select * from TJCSDJB_KSS where rybh = #{rybh} and djrq = #{djrq} and cssj = #{cssj} " +
            "and hssj = #{hssj} and cbdw = #{cbdw} and cbr = #{cbr} and czsjc = #{czsjc} and jsbh = #{jsbh}")
    List<TjcsdjKss> getActualTy(TjcsdjKss tjcsdjKss);

    @Insert("INSERT INTO TJCSDJB_KSS (ZYBH, RYBH,DJRQ,SSJD,CSSJ,SY," +
            "HSSJ,CBDW,CBR,PZR,TCRY,THRY,BZ,czsjc,JSBH)" +
            "values (#{zybh}, #{rybh}, #{djrq,jdbcType=TIMESTAMP}, #{ssjd}, #{cssj,jdbcType=TIMESTAMP}, #{sy}, #{hssj,jdbcType=TIMESTAMP}, #{cbdw}, #{cbr}" +
            ", #{pzr}, #{tcry}, #{thry}, #{bz}, #{czsjc}, #{jsbh})")
    int insActualTy(TjcsdjKss tjcsdjKss);

    @Select("select * from Txxxb_Kss where rybh = #{rybh} and badw = #{badw} and bar = #{bar} " +
            "and debar = #{debar} and txkssj = #{txkssj,jdbcType=TIMESTAMP} and txjssj = #{txjssj,jdbcType=TIMESTAMP} and czsjc = #{czsjc} and jsbh = #{jsbh}")
    List<TxxxbKss> getActualTx(TxxxbKss txxxbKss);

    @Insert("INSERT INTO Txxxb_Kss (ZYBH, RYBH,BADW,BAR,ZJHM,DEBAR," +
            "DEBARZJ,JSXBH,XWAY,SZYJ,SZ,SZQZRQ,TXKSSJ,TXJSSJ,TXDD,TCRY,THRY,JDMJ,BZ,TCRYID,THRYID,JDMJID,FACCODE,WJQRHSSJ,DHRY" +
            ",WJQRCSSJ,DCRY,czsjc,sybjl,JSBH)" +
            "values (#{zybh}, #{rybh}, #{badw}, #{bar}, #{zjhm}, #{debar}, #{debarzj}, #{jsxbh}, #{xway}" +
            ", #{szyj}, #{sz}, #{szqzrq,jdbcType=TIMESTAMP}, #{txkssj,jdbcType=TIMESTAMP}, #{txjssj,jdbcType=TIMESTAMP}, #{txdd}, #{tcry}, #{thry}, #{jdmj}, #{bz}, #{tcryid}" +
            ", #{thryid}, #{jdmjid}, #{faccode}, #{wjqrhssj,jdbcType=TIMESTAMP}, #{dhry}, #{wjqrcssj,jdbcType=TIMESTAMP}, #{dcry}, #{czsjc}, #{sybjl,jdbcType=TIMESTAMP}, #{jsbh})")
    int insActualTx(TxxxbKss txxxbKss);
}
