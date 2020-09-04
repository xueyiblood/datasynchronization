package com.yc.datasynchronization.infosystem.mapper;

import com.yc.datasynchronization.infosystem.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InfoMapper {
    @Select("select USERNAME as name  from SYS_USER")
    List<UserInfo> getInfoUser();
}
