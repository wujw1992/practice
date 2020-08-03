package com.asen.service.impl;

import com.asen.dao.UserDao;
import com.asen.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Asen
 * @date 2020/8/3
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }
}
