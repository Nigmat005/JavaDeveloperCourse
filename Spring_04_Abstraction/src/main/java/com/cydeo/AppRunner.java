package com.cydeo;

import com.cydeo.config.Config;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
        CommentService commentService_Bean = container.getBean(CommentService.class);

        Comment comment=new Comment();
        comment.setAuthor("Nick");
        comment.setText("JavaDeveloper Course Will Help You To Become Qualified Full Stack Developer");
//        Comment comment_Bean = container.getBean(Comment.class);
//        comment_Bean.setText("JavaDeveloper Course Will Help You To Become Qualified Full Stack Developer");
        commentService_Bean.publishComment(comment);
    }
}
