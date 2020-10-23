package com.seckill.agent.entity;

import com.seckill.agent.validator.IsMobile;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class SeckillUser extends com.seckill.agent.model.SeckillUser {
    private Integer id;
    @NotBlank(message = "手机号不能为空")
    @IsMobile
    private Long mobile;
    private String nickname;
    @NotBlank(message = "密码不能为空")
    @Length(min = 6, message = "密码长度错误")
    private String password;
    private String salt;
    private String head;
    private Date registerDate;
    private Date lastLoginDate;
    private Integer loginCount;
}
