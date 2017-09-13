package com.ithema.dao;

import com.ithema.domain.User;

/**
 * Created by Administrator on 2017/7/14.
 * 用户相关操作的持久层接口
 */
public interface IUserDao {

    /*
    * 根据用户名称查询用户
    * */
    User selectUserByUsername(String username);
/*
* 保存用户信息
* */
    int addUser(User user);
}
