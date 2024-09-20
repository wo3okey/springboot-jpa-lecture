package com.wooeky.lecture.todo.controller;

import com.wooeky.lecture.todo.dto.TodoRequest;
import com.wooeky.lecture.todo.dto.TodoResponse;
import com.wooeky.lecture.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @PostMapping("/api/v1/todos")
    public void saveTodo(
            @RequestBody TodoRequest todoRequest
    ) {
        todoService.saveTodo(todoRequest);
    }

    @GetMapping("/api/v1/todos")
    public ResponseEntity<List<TodoResponse>> getTodos() {
        return ResponseEntity.ok(todoService.getTodos());
    }

    @GetMapping("/api/v1/todos/{todoId}")
    public ResponseEntity<TodoResponse> getTodo(@PathVariable long todoId) {
        return ResponseEntity.ok(todoService.getTodo(todoId));
    }
}