package com.cydeo;

import com.cydeo.config.Config;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
//        CommentService commentService_Bean1 = container.getBean(CommentService.class);
//        CommentService commentService_Bean2 = container.getBean(CommentService.class);
//
//        System.out.println(commentService_Bean1);
//        System.out.println(commentService_Bean2);
//
//        Comment c1=new Comment();
//        Comment c2=new Comment();
//        System.out.println(c1==c2);

    }
}
