package com.ithema.web.action;

import com.ithema.domain.User;
import com.ithema.service.IUserService;
import com.ithema.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2017/7/17.
 * 用户操作相关的动作类
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
//定义一个用户的数据模型。注意：由于使用了模型驱动，我们必须自己实例化对象
  private IUserService service = new UserServiceImpl();
    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    public String register(){
/*
* 1.根据用户名获取数据库的用户对象
* 2.判断对象是否存在
*   2.1存在返回esists视图
*  3.不存在 保存用户信息
* */

User dbUser = service.findUserByUsername(user.getUsername());
if (dbUser !=null)
    return "exists";
int res = service.register(user);
if (res > 0) {
    return SUCCESS;
}
return null;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
