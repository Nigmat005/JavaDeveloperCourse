package com.cydeo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cydeo")
public class Config {
    /*
    Example of using @Bean for @Component annotation,
    Bean name can also be passed as qualifier.
    Check below.
     */
//@Bean(name = "execute1")
//    CommentPushNotificationProxy commentPushNotificationProxy(){
//    return new CommentPushNotificationProxy();
//}
}
