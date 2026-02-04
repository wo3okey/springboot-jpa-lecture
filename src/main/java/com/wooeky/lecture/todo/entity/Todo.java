package com.wooeky.lecture.todo.entity;

import com.wooeky.lecture.comment.entity.Comment;
import com.wooeky.lecture.manager.entity.Manager;
import com.wooeky.lecture.todo.dto.TodoRequest;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "contents")
    private String contents;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "todo_id")
    private List<Comment> comments = new ArrayList<>();
    @OneToMany(mappedBy = "todo")
    private List<Manager> managers = new ArrayList<>();

    public Todo(TodoRequest todoRequest) {
        this.title = todoRequest.getTitle();
        this.contents = todoRequest.getContents();
    }
}
