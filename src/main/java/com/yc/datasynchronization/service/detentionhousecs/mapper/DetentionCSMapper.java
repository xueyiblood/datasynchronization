package com.yc.datasynchronization.service.detentionhousecs.mapper;

import com.yc.datasynchronization.service.detentionhouse1.entity.*;
import com.yc.datasynchronization.service.detentionhousecs.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DetentionCSMapper {
    @Select({"<script>","select * from LSHJXXB",
            "<if test='hj == 0'>",
            "where hjkssj > TO_DATE(to_char(SYSDATE-20/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<SLshjxxb> getCSLshjxxb(@Param("hj") String hj);

    @Select("select rybh,rsrq from ryjbxxb")
    List<SRybdxxb> getCSRsrq();


    @Select({"<script>",
            "select * from RY_YLJLB where yltype = '所内医疗'",
            "<if test = 'yl == 0'>",
            "and zlsj > TO_DATE(to_char(SYSDATE-20/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<SYljlb> getCSYljib(@Param("yl") String yl);

    @Select({"<script>",
            "select * from TJCSDJB",
            "<if test = 'yl == 0'>",
            "where cssj > TO_DATE(to_char(SYSDATE-20/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')",
            "</if>",
            "</script>"})
    List<STjcsdj> getCSTjcsdj(@Param("ty") String ty);

}
