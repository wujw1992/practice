package com.asen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Asen
 * @date 2020/8/3
 */
@Configuration
//<context:component-scan base-package="com.asen"></context:component-scan>
@ComponentScan("com.asen")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}
