package com.Seafish.consumer;

import com.Seafish.common.Model.entity.User;
import com.Seafish.common.Service.UserService;
import com.Seafish.consumer.proxy.ServiceProxyFactory;

public class MainApplication
{
    public static void main( String[] args )
    {
        User user = new User("Seafish");

        UserService service = ServiceProxyFactory.getProxy(UserService.class);

        try {
            User newUser  = service.getUser(user);
            System.out.println("用户名是 " + newUser.getUserName());
        }catch (Exception e){
            System.out.println("User is null!!!!");
        }
    }
}
