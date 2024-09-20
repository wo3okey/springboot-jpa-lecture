package com.wooeky.lecture.comment.entity;

import com.wooeky.lecture.todo.entity.Todo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "contents")
    private String contents;
    @ManyToOne
    @JoinColumn(name = "todo_id")
    private Todo todo;

    public Comment(String contents, Todo todo) {
        this.contents = contents;
        this.todo = todo;
    }
}