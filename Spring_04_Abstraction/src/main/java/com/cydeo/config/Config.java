package com.cydeo.config;

import com.cydeo.proxy.CommentPushNotificationProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
