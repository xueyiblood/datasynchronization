package com.yc.datasynchronization.detentionhousetc.mapper;

import com.yc.datasynchronization.detentionhousecs.entity.SLshjxxb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DetentionTCMapper {
    @Select("select * from LSHJXXB where hjkssj > TO_DATE(to_char(SYSDATE-20/24/60,'yyyy-mm-dd HH24:MI:SS'),'yyyy-mm-dd hh24:mi:ss')")
    List<SLshjxxb> getTCLshjxxb();

}
