package com.Seafish.provider;

import com.Seafish.common.Model.entity.User;
import com.Seafish.common.Service.UserService;
import com.Seafish.provider.Service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class MainApplication
{
    public static void main( String[] args )
    {
        User user = new User("ljl");
        UserService userService = new UserServiceImpl();
        userService.getUser(user);
    }
}
