package com.Seafish.common.Model.entity;

import java.io.Serializable;

public class User implements Serializable {

    private String userName;

    public User(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
