package com.yc.datasynchronization.detentionhouse1.entity;


import lombok.Data;

/**
 * 老信息照片表实体类
 */
@Data
public class SZpb {
    private Integer zybh;
    private String rybh;
    private byte[] pic;
    private String czsjc;
}
