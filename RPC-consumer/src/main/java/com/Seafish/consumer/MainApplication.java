package com.Seafish.consumer;

import com.Seafish.common.Model.entity.User;
import com.Seafish.common.Service.UserService;

/**
 * Hello world!
 *
 */
public class MainApplication
{
    public static void main( String[] args )
    {
        User user = new User("Seafish");

        UserService service = null;

        try {
            User newUser  = service.getUser(user);
        }catch (Exception e){
            System.out.println("User is null!!!!");
        }
    }
}
