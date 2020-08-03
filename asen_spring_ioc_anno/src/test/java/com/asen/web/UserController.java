package com.asen.web;

import com.asen.config.SpringConfiguration;
import com.asen.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Asen
 * @date 2020/8/3
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService ds = app.getBean(UserService.class);
        ds.save();

    }
}
