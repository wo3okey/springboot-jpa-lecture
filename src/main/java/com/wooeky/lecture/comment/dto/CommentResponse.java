package com.wooeky.lecture.comment.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CommentResponse {
    final long id;
    final String contents;
}
