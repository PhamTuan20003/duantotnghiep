package com.tomford.application.service;

import com.tomford.application.entity.Comment;
import com.tomford.application.model.request.CreateCommentPostRequest;
import com.tomford.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest, long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
