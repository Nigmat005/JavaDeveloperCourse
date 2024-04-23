package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {
		ApplicationContext container=SpringApplication.run(CydeoApplication.class, args);

		CommentService commentService=container.getBean(CommentService.class);
		Comment comment=new Comment();
		comment.setAuthor("Nick");
		comment.setText("JavaDeveloper Course Will Help You To Become Qualified Full Stack Developer");
		commentService.publishComment(comment);

		// Returning port SpringBoot is running on

		System.out.println(commentService.portInfo());
	}

}
