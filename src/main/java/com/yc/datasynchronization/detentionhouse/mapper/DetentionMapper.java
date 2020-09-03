package com.yc.datasynchronization.detentionhouse.mapper;

import com.yc.datasynchronization.infosystem.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DetentionMapper {
    @Select("select id, box_code as name  from box")
    List<UserInfo> getDetentionUser();
}
