package com.zr.service;

import com.zr.dao.UserDao;
import com.zr.dao.vo.MessageModule;
import com.zr.entity.User;
import com.zr.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public MessageModule checkLogin(String name, String pwd) {
        MessageModule messageModule = new MessageModule();
        if (StringUtil.isEmpty(name) || StringUtil.isEmpty(pwd)) {
            System.out.println("用户名活密码不能为空");
            messageModule.setResult(0);
            messageModule.setMessageResult("用户名活密码不能为空");
        }
        User user = userDao.queryUserByUserName(name);
        if (user == null) {
            messageModule.setMessageResult("用户名不存在");
            messageModule.setResult(0);
        }
        if (!pwd.equals(user.getPwd())) {
            messageModule.setResult(0);
            messageModule.setMessageResult("密码不正确");
        }
        return messageModule;
    }

}
