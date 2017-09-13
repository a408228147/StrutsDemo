package com.ithema.service.impl;

import com.ithema.dao.IUserDao;
import com.ithema.dao.impl.UserDaoImpl;
import com.ithema.domain.User;
import com.ithema.service.IUserService;

/**
 * Created by Administrator on 2017/7/14.
 */
public class UserServiceImpl implements IUserService {
    private IUserDao dao = new UserDaoImpl();


    @Override
    public User findUserByUsername(String username) {
        return dao.selectUserByUsername(username);
    }

    @Override
    public int register(User user) {
        return dao.addUser(user);
    }
}
