package com.ithema.dao.impl;

import com.ithema.dao.IUserDao;
import com.ithema.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

/**
 * Created by Administrator on 2017/7/14.
 */
public class UserDaoImpl implements IUserDao {

    private QueryRunner qr = new QueryRunner(com.ithema.utils.DBCPUtil.getDataSource());
    @Override
    public User selectUserByUsername(String username) {
       try{
               return qr.query("select  * from user where username = ?",new BeanHandler<User>(User.class),username);
       }catch (Exception e){
           throw new RuntimeException(e);
       }

    }

    @Override
    public int addUser(User user) {
        try{
            return qr.update("insert into user values(?,?,?,?,?)",user.getUsername(),user.getPassword(),user.getBirthday(),user.getHobby(),user.isMarried());
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
