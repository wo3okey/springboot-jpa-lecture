package com.wooeky.lecture.todo.dto;

import com.wooeky.lecture.comment.dto.CommentResponse;
import com.wooeky.lecture.manager.dto.ManagerResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class TodoResponse {
    final long id;
    final String title;
    final String contents;
    final List<CommentResponse> comments;
    final List<ManagerResponse> managers;
}
