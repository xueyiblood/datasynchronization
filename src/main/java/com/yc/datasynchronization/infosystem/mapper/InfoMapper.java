package com.yc.datasynchronization.infosystem.mapper;

import com.yc.datasynchronization.infosystem.entity.Lshjxx;
import com.yc.datasynchronization.infosystem.entity.Rybdxx;
import com.yc.datasynchronization.infosystem.entity.Ryjbxx;
import com.yc.datasynchronization.infosystem.entity.Zpb;
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

    @Select({"<script>","select * from LSHJXXB_KSS where jsbh = #{jsbh}",
            "<if test='key == 0'>",
            "and hjkssj > TO_DATE(to_char(SYSDATE-20/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<Lshjxx> getInfoLshjxxb(@Param("jsbh") String jsbh,@Param("key") String key);


    @Select("select * from ryjbxxb_kss where rybj = 0 and zyjsbh = #{jsbh, jdbcType=VARCHAR})")
    List<Rybdxx> getInfoRsrq(@Param("jsbh") String jsbh);
}
