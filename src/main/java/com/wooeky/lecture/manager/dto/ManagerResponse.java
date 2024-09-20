package com.wooeky.lecture.manager.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ManagerResponse {
    final long id;
    final String name;
}
