package com.wooeky.lecture.todo.service;

import com.wooeky.lecture.comment.dto.CommentResponse;
import com.wooeky.lecture.manager.dto.ManagerResponse;
import com.wooeky.lecture.todo.dto.TodoRequest;
import com.wooeky.lecture.todo.dto.TodoResponse;
import com.wooeky.lecture.todo.entity.Todo;
import com.wooeky.lecture.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    @Transactional
    public void saveTodo(TodoRequest todoRequest) {
        todoRepository.save(new Todo(todoRequest));
    }

    public Todo getTodoEntity(long todoId) {
        return todoRepository.findById(todoId).orElseThrow();
    }

    public TodoResponse getTodo(long todoId) {
        Todo todo = todoRepository.findById(todoId).orElseThrow();
        return new TodoResponse(
                todo.getId(),
                todo.getTitle(),
                todo.getContents(),
                todo.getComments().stream().map(comment -> new CommentResponse(comment.getId(), comment.getContents())).toList(),
                todo.getManagers().stream().map(manager -> new ManagerResponse(manager.getId(), manager.getName())).toList()
        );
    }

    public List<TodoResponse> getTodos() {
        List<Todo> todos = todoRepository.findAll();

        return todos.stream()
                .map(todo ->
                        new TodoResponse(
                                todo.getId(),
                                todo.getTitle(),
                                todo.getContents(),
                                todo.getComments().stream().map(comment -> new CommentResponse(comment.getId(), comment.getContents())).toList(),
                                todo.getManagers().stream().map(manager -> new ManagerResponse(manager.getId(), manager.getName())).toList()
                        )
                ).toList();
    }
}
