package com.yc.datasynchronization.detentionhouse1.mapper;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SZpb;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DetentionMapper {

    @Select("select * from ryjbxxb where rybh = #{rybh, jdbcType=VARCHAR}")
    List<SRyjbxxb> getDt1Ryjbxxb(@Param("rybh") String rybh);

    @Select("select * from rybdxxb where rybh = #{rybh, jdbcType=VARCHAR}")
    List<SRybdxxb> getDt1Rybdxxb(@Param("rybh") String rybh);

    @Select("select * from zpb where rybh = #{rybh, jdbcType=VARCHAR}")
    List<SZpb> getDt1Zpb(@Param("rybh") String rybh);

    @Delete("delete zpb where rybh = #{rybh}")
    int delDt1Zpb(@Param("rybh") String rybh);

    @Insert("insert into zpb (rybh,pic,czsjc) values(#{rybh},#{pic},#{czsjc})")
    int insDt1Zpb (SZpb zpb);

    @Update("update ryjbxxb set jsbh= #{jsbh}," +
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
            "yxlshj= #{yxlshj},rsqbx= #{rsqbx} where rybh = #{rybh}")
    int updDt1Ryjbxxb(SRyjbxxb ryjbxx);

    @Insert("insert into RYJBXXB (RYBH,JSBH,BH,XM,XB,CSRQ,ZZMM,ZJLX,ZJHM,HZH,HYZK,MZ,GJ," +
            "JG,ZC,WHCD,ZY,GZDW,ZW,SF,TSSF,HJSZD,HJDXZ,XZZQH,XZZXZ,Dah,Zwbh,BZ," +
            "JSH,GYQX,RYBJ,PYZT,CZR,SDRQ,FLWSH,HYRQ,SSJD,BADWLX,BADW,BAR," +
            "Clsj,Cljg,Xq,Xqksrq,Xqjzrq,Fjcl,Fjclxq,Ssrq,Zxrq,Fjje,Hxxq,Spz,BARDH,WXDJ,Fh,CZSJC,JBXXLB," +
            "Stxxlb,Zhxxlb,Jbxxzfs,Stxxzfs,Zhxxzfs,Rsqbxfs,YXLSHJ,RSQBX)" +
            "values(#{rybh},#{jsbh},#{bh},#{xm},#{xb},#{csrq},#{zzmm},#{zjlx},#{zjhm},#{hzh},#{hyzk},#{mz},#{gj}," +
            "#{jg},#{zc},#{whcd},#{zy},#{gzdw},#{zw},#{sf},#{tssf},#{hjszd},#{hjdxz},#{xzzqh},#{xzzxz},#{dah},#{zwbh},#{bz}," +
            "#{jsh},#{gyqx},#{rybj},#{pyzt},#{czr},#{sdrq},#{flwsh},#{hyrq},#{ssjd},#{badwlx},#{badw},#{bar}," +
            "#{clsj},#{cljg},#{xq},#{xqksrq},#{xqjzrq},#{fjcl},#{fjclxq},#{ssrq},#{zxrq},#{fjje},#{hxxq},#{spz},#{bardh},#{wxdj},#{fh}," +
            "#{czsjc},#{jbxxlb},#{stxxlb},#{zhxxlb},#{jbxxzfs},#{stxxzfs},#{zhxxzfs},#{rsqbxfs},#{yxlshj},#{rsqbx})")
    int insDt1Ryjbxxb(SRyjbxxb ryjbxx);

    @Delete("delete rybdxxb from rybh = #{rybh}")
    int delDt1Rybdxxb(@Param("rybh") String rybh);

    @Insert("insert into RYBDXXB (RYBH,DBRQ,JLRQ,RSRQ,RSYY,SYPZ,ZLDW,SYDW,SYR,FLWSH,BZ,WFFZJL,CYLB,AJLB,JYAQ," +
            "ZXF,RYGLLB,BADW,PZRQ,PZDW,PZR,Csrq,CSYY,CSQX,JDDW,DBR,DBRYZYRGX,DBRZZ,DBRGZDW," +
            "SNBX,HSSJ,JYRQ,WZBF,FACCODE,CZSJC) " +
            "values(#{rybh},#{dbrq},#{jlrq},#{rsrq},#{rsyy},#{sypz},#{zldw},#{sydw},#{syr}," +
            "#{flwsh},#{bz},#{wffzjl},#{cylb},#{ajlb},#{jyaq}," +
            "#{zxf},#{rygllb},#{badw},#{pzrq},#{pzdw},#{pzr},#{csrq},#{csyy},#{csqx},#{jddw},#{dbr},#{dbryzyrgx},#{dbrzz},#{dbrgzdw}," +
            "#{snbx},#{hssj},#{jyrq},#{wzbf},#{faccode},#{czsjc})")
    int insDt1Rybdxxb(SRybdxxb rybdxx);
}
