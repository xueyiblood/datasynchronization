package com.yc.datasynchronization.service.infosystem.mapper;

import com.yc.datasynchronization.service.infosystem.entity.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InfoMapper {


    @Select("select * from ryjbxxb_kss where rybj = 0 and zyjsbh = #{jsbh, jdbcType=VARCHAR}" +
            "and updatetime > TO_DATE(to_char(SYSDATE-15/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')")
    List<Ryjbxx> getInfoRyjbxxb(@Param("jsbh") String jsbh);

    @Select("select * from rybdxxb_kss where rybh = #{rybh, jdbcType=VARCHAR} ORDER BY rsrq DESC")
    List<Rybdxx> getInfoRybdxxb(@Param("rybh") String rybh);

    @Select("select * from zpb_kss where rybh = #{rybh, jdbcType=VARCHAR}")
    Zpb getInfoZpb(@Param("rybh") String rybh);

    @Select({"<script>","select * from LSHJXXB_KSS where zyjsbh = #{jsbh} and hjjssj is not null",
            "<if test='key == 0'>",
            "and hjjssj > TO_DATE(to_char(SYSDATE-1,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<Lshjxx> getInfoLshjxxb(@Param("jsbh") String jsbh, @Param("key") String key);


    @Select("select * from ryjbxxb_kss where zyjsbh = #{jsbh, jdbcType=VARCHAR}")
    List<Rybdxx> getInfoRsrq(@Param("jsbh") String jsbh);

    @Select({"<script>",
            "select * from RY_YLJLB_KSS where zyjsbh = #{jsbh} and yltype = '所内就医'",
            "<if test = 'yl == 0'>",
            "and zlsj > TO_DATE(to_char(SYSDATE-60/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<Yljlb> getInfoYljib(@Param("jsbh") String jsbh, @Param("yl") String yl);


    @Select({"<script>",
            "select * from TJCSDJB_KSS where zyjsbh = #{jsbh} and hssj is not null",
            "<if test = 'ty == 0'>",
            "and cssj > TO_DATE(to_char(SYSDATE-1,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<Tjcsdj> getInfoTjcsdj(@Param("jsbh") String jsbh, @Param("ty") String ty);

    @Select({"<script>",
            "select * from TXXXB_KSS where zyjsbh = #{jsbh} and txjssj is not null  ",
            "<if test = 'tx == 0'>",
            "and txjssj > TO_DATE(to_char(SYSDATE-1,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<Txxxb> getInfoTxxxb(@Param("jsbh") String jsbh, @Param("tx") String tx);


    @Insert("insert into RYBDXXB_KSS (ZYBH,RYBH,DBRQ,JLRQ,RSRQ,RSYY,SYPZ,ZLDW,SYDW,SYR,FLWSH,BZ,WFFZJL,CYLB,AJLB,JYAQ," +
            "ZXF,RYGLLB,BADW,PZRQ,PZDW,PZR,Csrq,CSYY,CSQX,JDDW,DBR,DBRYZYRGX,DBRZZ,DBRGZDW," +
            "SNBX,HSSJ,JYRQ,WZBF,FACCODE,CZSJC,ISDEL,ZYJSBH) " +
            "values((select nvl(max(zybh),0)+1 from RYBDXXB_KSS),#{rybh, jdbcType=VARCHAR},#{dbrq, jdbcType=DATE},#{jlrq, jdbcType=DATE},#{rsrq, jdbcType=DATE},#{rsyy, jdbcType=VARCHAR},#{sypz, jdbcType=VARCHAR},#{zldw, jdbcType=VARCHAR},#{sydw, jdbcType=VARCHAR},#{syr, jdbcType=VARCHAR}," +
            "#{flwsh, jdbcType=VARCHAR},#{bz, jdbcType=VARCHAR},#{wffzjl, jdbcType=VARCHAR},#{cylb, jdbcType=VARCHAR},#{ajlb, jdbcType=VARCHAR},#{jyaq, jdbcType=VARCHAR}," +
            "#{zxf, jdbcType=VARCHAR},#{rygllb, jdbcType=VARCHAR},#{badw, jdbcType=VARCHAR},#{pzrq, jdbcType=DATE},#{pzdw, jdbcType=VARCHAR},#{pzr, jdbcType=VARCHAR},#{csrq, jdbcType=DATE},#{csyy, jdbcType=VARCHAR},#{csqx, jdbcType=VARCHAR},#{jddw, jdbcType=VARCHAR},#{dbr, jdbcType=VARCHAR},#{dbryzyrgx, jdbcType=VARCHAR},#{dbrzz, jdbcType=VARCHAR},#{dbrgzdw, jdbcType=VARCHAR}," +
            "#{snbx, jdbcType=VARCHAR},#{hssj, jdbcType=DATE},#{jyrq, jdbcType=DATE},#{wzbf, jdbcType=NUMERIC},#{faccode, jdbcType=NUMERIC},#{czsjc, jdbcType=VARCHAR},#{isdel, jdbcType=NUMERIC},#{zyjsbh, jdbcType=VARCHAR})")
    void insertIntoRybdxxb(Rybdxx rybdxx);

    @Insert("insert into RYJBXXB_KSS (RYBH,ZYJSBH,BH,XM,XB,CSRQ,ZZMM,ZJLX,ZJHM,HZH,HYZK,MZ,GJ," +
            "JG,ZC,WHCD,ZY,GZDW,ZW,SF,TSSF,HJSZD,HJDXZ,XZZQH,XZZXZ,Dah,Zwbh,BZ," +
            "JSH,GYQX,RYBJ,PYZT,CZR,SDRQ,FLWSH,HYRQ,SSJD,BADWLX,BADW,BAR," +
            "Clsj,Cljg,Xq,Xqksrq,Xqjzrq,Fjcl,Fjclxq,Ssrq,Zxrq,Fjje,Hxxq,Spz,BARDH,WXDJ,Fh,CZSJC,JBXXLB," +
            "Stxxlb,Zhxxlb,Jbxxzfs,Stxxzfs,Zhxxzfs,Rsqbxfs,YXLSHJ,RSQBX)" +
            "values(#{rybh, jdbcType=VARCHAR},#{zyjsbh, jdbcType=VARCHAR},#{bh, jdbcType=VARCHAR},#{xm, jdbcType=VARCHAR},#{xb, jdbcType=VARCHAR},#{csrq, jdbcType=DATE},#{zzmm, jdbcType=VARCHAR},#{zjlx, jdbcType=VARCHAR},#{zjhm, jdbcType=VARCHAR},#{hzh, jdbcType=VARCHAR},#{hyzk, jdbcType=VARCHAR},#{mz, jdbcType=VARCHAR},#{gj, jdbcType=VARCHAR}," +
            "#{jg, jdbcType=VARCHAR},#{zc, jdbcType=VARCHAR},#{whcd},#{zy, jdbcType=VARCHAR},#{gzdw, jdbcType=VARCHAR},#{zw, jdbcType=VARCHAR},#{sf, jdbcType=VARCHAR},#{tssf, jdbcType=VARCHAR},#{hjszd, jdbcType=VARCHAR},#{hjdxz, jdbcType=VARCHAR},#{xzzqh, jdbcType=VARCHAR},#{xzzxz, jdbcType=VARCHAR},#{dah, jdbcType=VARCHAR},#{zwbh, jdbcType=VARCHAR},#{bz, jdbcType=VARCHAR}," +
            "#{jsh, jdbcType=VARCHAR},#{gyqx, jdbcType=DATE},#{rybj, jdbcType=NUMERIC},#{pyzt, jdbcType=VARCHAR},#{czr, jdbcType=VARCHAR},#{sdrq, jdbcType=DATE},#{flwsh, jdbcType=VARCHAR},#{hyrq, jdbcType=DATE},#{ssjd, jdbcType=VARCHAR},#{badwlx},#{badw, jdbcType=VARCHAR},#{bar, jdbcType=VARCHAR}," +
            "#{clsj, jdbcType=DATE},#{cljg, jdbcType=VARCHAR},#{xq, jdbcType=VARCHAR},#{xqksrq, jdbcType=DATE},#{xqjzrq, jdbcType=DATE},#{fjcl, jdbcType=VARCHAR},#{fjclxq, jdbcType=VARCHAR},#{ssrq, jdbcType=DATE},#{zxrq, jdbcType=DATE},#{fjje, jdbcType=VARCHAR},#{hxxq, jdbcType=VARCHAR},#{spz, jdbcType=VARCHAR},#{bardh, jdbcType=VARCHAR},#{wxdj},#{fh, jdbcType=VARCHAR}," +
            "#{czsjc, jdbcType=VARCHAR},#{jbxxlb, jdbcType=VARCHAR},#{stxxlb, jdbcType=VARCHAR},#{zhxxlb, jdbcType=VARCHAR},#{jbxxzfs, jdbcType=NUMERIC},#{stxxzfs, jdbcType=NUMERIC},#{zhxxzfs, jdbcType=NUMERIC},#{rsqbxfs, jdbcType=NUMERIC},#{yxlshj, jdbcType=VARCHAR},#{rsqbx, jdbcType=VARCHAR})")
    void insertIntoRyjbxxb(Ryjbxx ryjbxx);

    @Insert("insert into ZPB_KSS (zybh,rybh,pic,czsjc) values((select nvl(max(zybh),0)+1 from ZPB_KSS),#{rybh, jdbcType=VARCHAR},#{pic, jdbcType=VARCHAR},#{czsjc, jdbcType=VARCHAR})")
    void insertIntoZpb(Zpb zp);
}
