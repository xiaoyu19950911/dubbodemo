package com.xiaoyu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @program: dubbodemo
 * @description:
 * @author: XiaoYu
 * @create: 2018-05-28 15:28
 **/
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nickName;

    private Integer age;

    private Date createTime;

    private Date updateTime;
}
