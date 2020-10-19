package com.yc.datasynchronization.service.infosystem.mapper;

import com.yc.datasynchronization.service.infosystem.entity.*;
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
            "and cssj > TO_DATE(to_char(SYSDATE-25/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
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
}
