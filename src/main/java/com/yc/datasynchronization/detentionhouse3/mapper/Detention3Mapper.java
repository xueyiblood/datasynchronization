package com.yc.datasynchronization.detentionhouse3.mapper;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SRyjbxxb;
import com.yc.datasynchronization.detentionhouse1.entity.SZpb;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface Detention3Mapper {

    @Select("select * from ryjbxxb where rybh = #{rybh, jdbcType=VARCHAR}")
    List<SRyjbxxb> getDt3Ryjbxxb(@Param("rybh") String rybh);

    @Select("select * from rybdxxb where rybh = #{rybh, jdbcType=VARCHAR}")
    List<SRybdxxb> getDt3Rybdxxb(@Param("rybh") String rybh);

    @Select("select * from zpb where rybh = #{rybh, jdbcType=VARCHAR}")
    List<SZpb> getDt3Zpb(@Param("rybh") String rybh);

    @Delete("delete zpb where rybh = #{rybh}")
    int delDt3Zpb(@Param("rybh") String rybh);

    @Insert("insert into zpb (rybh,pic,czsjc) values(#{rybh},#{pic},#{czsjc})")
    int insDt3Zpb (SZpb zpb);

    @Update("update ryjbxxb set JSBH= #{JSBH}," +
            "BH= #{BH},XM= #{XM},XB= #{XB},CSRQ= #{CSRQ}," +
            "ZZMM= #{ZZMM},ZJLX= #{ZJLX},ZJHM= #{ZJHM},HYZK= #{HYZK}," +
            "MZ= #{MZ},GJ= #{GJ},JG= #{JG},ZC= #{ZC},WHCD= #{WHCD}," +
            "ZY= #{ZY},GZDW= #{GZDW},ZW= #{ZW},SF= #{SF},TSSF= #{TSSF}," +
            "HJSZD= #{HJSZD},HJDXZ= #{HJDXZ},XZZQH= #{XZZQH},XZZXZ= #{XZZXZ},BZ= #{BZ}," +
            "JSH= #{JSH},GYQX= #{GYQX},RYBJ= #{RYBJ},PYZT= #{PYZT}," +
            "CZR= #{CZR},SDRQ= #{SDRQ},FLWSH= #{FLWSH},HYRQ= #{HYRQ},SSJD= #{SSJD}," +
            "BADWLX= #{BADWLX},BADW= #{BADW},BAR= #{BAR}, Clsj= #{Clsj},Cljg= #{Cljg},Xq= #{Xq}," +
            "Xqksrq= #{Xqksrq},Xqjzrq= #{Xqjzrq},Fjcl= #{Fjcl}," +
            "Fjclxq= #{Fjclxq},Ssrq= #{Ssrq},Zxrq= #{Zxrq},Fjje= #{Fjje},Hxxq= #{Hxxq},Spz= #{Spz}," +
            "BARDH= #{BARDH},WXDJ= #{WXDJ},Fh= #{Fh},CZSJC= #{CZSJC},JBXXLB= #{JBXXLB}," +
            "Stxxlb= #{Stxxlb},Zhxxlb= #{Zhxxlb},Jbxxzfs= #{Jbxxzfs},Stxxzfs= #{Stxxzfs},Zhxxzfs= #{Zhxxzfs},Rsqbxfs= #{Rsqbxfs}," +
            "YXLSHJ= #{YXLSHJ},RSQBX= #{RSQBX} where rybh = #{rybh}")
    int updDt3Ryjbxxb(SRyjbxxb ryjbxx);

    @Insert("insert into RYJBXXB (RYBH,JSBH,BH,XM,XB,CSRQ,ZZMM,ZJLX,ZJHM,HZH,HYZK,MZ,GJ," +
            "JG,ZC,WHCD,ZY,GZDW,ZW,SF,TSSF,HJSZD,HJDXZ,XZZQH,XZZXZ,Dah,Zwbh,BZ," +
            "JSH,GYQX,RYBJ,PYZT,CZR,SDRQ,FLWSH,HYRQ,SSJD,BADWLX,BADW,BAR," +
            "Clsj,Cljg,Xq,Xqksrq,Xqjzrq,Fjcl,Fjclxq,Ssrq,Zxrq,Fjje,Hxxq,Spz,BARDH,WXDJ,Fh,CZSJC,JBXXLB," +
            "Stxxlb,Zhxxlb,Jbxxzfs,Stxxzfs,Zhxxzfs,Rsqbxfs,YXLSHJ,RSQBX)" +
            "values(#{RYBH},#{JSBH},#{BH},#{XM},#{XB},#{CSRQ},#{ZZMM},#{ZJLX},#{ZJHM},#{HZH},#{HYZK},#{MZ},#{GJ}," +
            "#{JG},#{ZC},#{WHCD},#{ZY},#{GZDW},#{ZW},#{SF},#{TSSF},#{HJSZD},#{HJDXZ},#{XZZQH},#{XZZXZ},#{dah},#{zwbh},#{BZ}," +
            "#{JSH},#{GYQX},#{RYBJ},#{PYZT},#{CZR},#{SDRQ},#{FLWSH},#{HYRQ},#{SSJD},#{BADWLX},#{BADW},#{BAR}," +
            "#{Clsj},#{Cljg},#{Xq},#{Xqksrq},#{Xqjzrq},#{Fjcl},#{Fjclxq},#{Ssrq},#{Zxrq},#{Fjje},#{Hxxq},#{Spz},#{BARDH},#{WXDJ},#{Fh}," +
            "#{CZSJC},#{JBXXLB},#{Stxxlb},#{Zhxxlb},#{Jbxxzfs},#{Stxxzfs},#{Zhxxzfs},#{Rsqbxfs},#{YXLSHJ},#{RSQBX})")
    int insDt3Ryjbxxb(SRyjbxxb ryjbxx);

    @Delete("delete rybdxxb from rybh = #{rybh}")
    int delDt3Rybdxxb(@Param("rybh") String rybh);

    @Insert("insert into RYBDXXB (RYBH,DBRQ,JLRQ,RSRQ,RSYY,SYPZ,ZLDW,SYDW,SYR,FLWSH,BZ,WFFZJL,CYLB,AJLB,JYAQ," +
            "ZXF,RYGLLB,BADW,PZRQ,PZDW,PZR,Csrq,CSYY,CSQX,JDDW,DBR,DBRYZYRGX,DBRZZ,DBRGZDW," +
            "SNBX,HSSJ,JYRQ,WZBF,FACCODE,CZSJC) " +
            "values(#{RYBH},#{DBRQ},#{JLRQ},#{RSRQ},#{RSYY},#{SYPZ},#{ZLDW},#{SYDW},#{SYR}," +
            "#{FLWSH},#{BZ},#{WFFZJL},#{CYLB},#{AJLB},#{JYAQ}," +
            "#{ZXF},#{RYGLLB},#{BADW},#{PZRQ},#{PZDW},#{PZR},#{Csrq},#{CSYY},#{CSQX},#{JDDW},#{DBR},#{DBRYZYRGX},#{DBRZZ},#{DBRGZDW}," +
            "#{SNBX},#{HSSJ},#{JYRQ},#{WZBF},#{FACCODE},#{CZSJC})")
    int insDt3Rybdxxb(SRybdxxb rybdxx);
}
