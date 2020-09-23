package com.yc.datasynchronization.detentionhouseks.mapper;

import com.yc.datasynchronization.detentionhouse1.entity.SRybdxxb;
import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import com.yc.datasynchronization.detentionhousecs.entity.STjcsdj;
import com.yc.datasynchronization.detentionhousecs.entity.SYljlb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DetentionKSMapper {
    @Select({"<script>","select * from LSHJXXB",
            "<if test='hj == 0'>",
            "where hjkssj > TO_DATE(to_char(SYSDATE-20/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<SLshjxxb> getKSLshjxxb(@Param("hj") String hj);

    @Select("select rybh,rsrq from ryjbxxb")
    List<SRybdxxb> getKSRsrq();

    @Select({"<script>",
            "select * from RY_YLJLB where yltype = '所内医疗'",
            "<if test = 'yl == 0'>",
            "and zlsj > TO_DATE(to_char(SYSDATE-20/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<SYljlb> getKSYljib(@Param("yl") String yl);

    @Select({"<script>",
            "select * from TJCSDJB",
            "<if test = 'yl == 0'>",
            "where cssj > TO_DATE(to_char(SYSDATE-20/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<STjcsdj> getKSTjcsdj(@Param("ty") String ty);

}
