package com.Seafish.provider.Service;

import com.Seafish.common.Model.entity.User;
import com.Seafish.common.Service.UserService;

import java.sql.SQLOutput;

public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("你的名字是" + user.getUserName());
        return user;
    }
}
