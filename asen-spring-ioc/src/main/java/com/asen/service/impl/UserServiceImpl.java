package com.asen.service.impl;

import com.asen.dao.UserDao;
import com.asen.dao.impl.UserDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.asen.service.UserService;

public class UserServiceImpl implements UserService {
    public UserServiceImpl(UserDaoImpl userDao) {
    }

    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
