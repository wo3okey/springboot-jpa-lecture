package com.wooeky.lecture.comment.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CommentRequest {
    String contents;
}
