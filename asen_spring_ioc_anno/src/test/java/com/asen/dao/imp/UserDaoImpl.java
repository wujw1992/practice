package com.asen.dao.imp;

import com.asen.dao.UserDao;
import com.asen.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author Asen
 * @date 2020/8/3
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
