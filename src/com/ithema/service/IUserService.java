package com.ithema.service;

import com.ithema.domain.User;

/**
 * Created by Administrator on 2017/7/14.
 * 用户相关操作的业务层接口
 */
public interface IUserService {

    /*
    * 根据用户名判断用户是否存在
    * */
    User findUserByUsername(String username);
    /*用户注册*/
   int  register(User user);
}
