package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Data
@Component
/*
Using scope of prototype would create multiple objects(Beans),
that being said, container creation is not step to create all objects(Beans)
instead, after having container creation, we start creating our objects(Beans)
e.g:
In AppRunner class, step of below
  ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
will not have all beans and dependencies prepared, which means container creation is not really creating
any beans until you use container to create objects you want.
See below
e.g:
CommentService commentService_Bean1 = container.getBean(CommentService.class);
now, we can say that object(Bean) of CommentService with instance called commentService_Bean1 is created.

CommentService commentService_Bean2 = container.getBean(CommentService.class);

and this is another bean called commentService_Bean2 created.
And commentService_Bean1 with commentService_Bean2 is different object(Bean)


But default scope type which is singleton will help you to create all object(Beans)
and dependencies once container is created. That's why if you run app after creating below
ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
you will see the message of (Comment Service Is Instantiated) in constructor of CommentService class
 */

//@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Lazy
// LAzy annotation will only help you create Object(Beans) only after object or dependencies are required
// instead of once creating container

public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService( @Qualifier("EmailComment") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository){
        this.commentNotificationProxy=commentNotificationProxy;
        this.commentRepository=commentRepository;
        System.out.println("Comment Service Is Instantiated");
    }

    public void publishComment(Comment comment){
        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }



}
