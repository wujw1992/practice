package com.asen.test;

import com.asen.config.SpringConfiguration;
import com.asen.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Asen
 * @date 2020/8/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @Test
    public void test1() throws SQLException {
        userService.save();

        System.out.println(dataSource.getConnection());
    }

}
