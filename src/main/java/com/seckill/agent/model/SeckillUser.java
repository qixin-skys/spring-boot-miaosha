package com.seckill.agent.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;
import java.util.Date;

/**
 * seckill_user
 * @author gaoFan
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "seckill_user")
public class SeckillUser{
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 手机号码
     */
    private String mobile;

    private String nickname;

    /**
     * MD5(MD5(PASS明文+固定salt)+固定salt)
     */
    private String password;

    private String salt;

    /**
     * 头像，云存储的ID
     */
    private String head;

    /**z
     * 注册时间
     */
    private Date registerDate;

    /**
     * 上次登录时间
     */
    private Date lastLoginDate;

    private Integer loginCount;

    private static final long serialVersionUID = 1L;

}