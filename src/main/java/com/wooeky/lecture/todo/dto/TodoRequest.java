package com.wooeky.lecture.todo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class TodoRequest {
    final String title;
    final String contents;
}
