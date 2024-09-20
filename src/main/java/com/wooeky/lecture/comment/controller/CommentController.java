package com.wooeky.lecture.comment.controller;

import com.wooeky.lecture.comment.dto.CommentRequest;
import com.wooeky.lecture.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/comments")
    public void saveComment(
            @RequestParam long todoId,
            @RequestBody CommentRequest commentRequest
    ) {
        commentService.saveComment(todoId, commentRequest);
    }
}
