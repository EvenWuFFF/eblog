package com.example.service;

import com.example.common.lang.Result;
import com.example.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shiro.AccountProfile;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author
 * @since 2022-05-02
 */
public interface UserService extends IService<User> {

    Result register(User user);

    AccountProfile login(String username, String password);
}
