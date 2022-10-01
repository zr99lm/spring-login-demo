package com.zr;

import com.zr.controller.UserController;
import com.zr.dao.vo.MessageModule;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = (UserController) ac.getBean("userController");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名and密码");
        MessageModule messageModule = userController.userLogin(sc.nextLine(), sc.nextLine());
        System.out.println("状态码"+messageModule.getResult()+"返回值"+messageModule.getMessageResult());
    }
}
