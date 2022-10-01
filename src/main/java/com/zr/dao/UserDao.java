package com.zr.dao;

import com.zr.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private final String username="admin";
    private final String pwd="123456";

    public User queryUserByUserName(String username){
        User user=null;
        if(this.username.equals(username)){
            user=new User();
            user.setUsername(username);
            user.setPwd(this.pwd);
            return user;
        }
        else {
            return user;
        }
    }
}
