package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Data
@Component
public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService( @Qualifier("EmailComment") CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository){
        this.commentNotificationProxy=commentNotificationProxy;
        this.commentRepository=commentRepository;
    }

    public void publishComment(Comment comment){
        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }



}
