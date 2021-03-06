package com.miaosha.agent.service;

import com.miaosha.agent.dto.req.LoginUserDTO;
import com.miaosha.agent.entity.LoginVo;

/**
 * 用户
 *
 * @author qiXin
 * @date 2020/9/23
 **/
public interface UserService {

    /**
     * 根据ID获取信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    LoginVo getById(int id);

    /**
     * 新增用户信息
     *
     * @param loginUserDTO 用户信息
     * @return 成功返回1
     */
    int insertUser(LoginUserDTO loginUserDTO);

}
