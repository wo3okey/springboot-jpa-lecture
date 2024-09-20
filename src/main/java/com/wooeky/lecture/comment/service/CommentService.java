package com.wooeky.lecture.comment.service;

import com.wooeky.lecture.comment.dto.CommentRequest;
import com.wooeky.lecture.comment.entity.Comment;
import com.wooeky.lecture.comment.repository.CommentRepository;
import com.wooeky.lecture.todo.entity.Todo;
import com.wooeky.lecture.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final TodoService todoService;

    @Transactional
    public void saveComment(long todoId, CommentRequest commentRequest) {
        Todo todo = todoService.getTodoEntity(todoId);
        commentRepository.save(new Comment(commentRequest.getContents(), todo));
    }
}
